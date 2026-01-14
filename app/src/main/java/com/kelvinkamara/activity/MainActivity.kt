package com.kelvinkamara.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var goToButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(
            this@MainActivity,
            "onCreate called.",
            Toast.LENGTH_SHORT
        ).show()

        goToButton = findViewById(R.id.button_go_to_activity)
        goToButton.setOnClickListener {
//            Intent(this@MainActivity, SecondActivity::class.java).also {
//                startActivity(it)
//            }
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(Constants.INTENT_MESSAGE_KEY, "Hello from first activity.")
            intent.putExtra(Constants.INTENT_MESSAGE_2_KEY, "How was your day?")
            intent.putExtra(Constants.INTENT_DATA_NUMBER, 3.14)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this@MainActivity,
            "onStart called.",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this@MainActivity,
            "onStart called.",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this@MainActivity,
            "onPause called.",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this@MainActivity,
            "onStop called.",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            this@MainActivity,
            "onDestroy called.",
            Toast.LENGTH_SHORT
        ).show()
    }
}