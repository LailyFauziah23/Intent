package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the data passed from LoginActivity
        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val phone = intent.getStringExtra("PHONE")

        // Display the data on the screen
        binding.welcomeTextView.text = "Welcome $username"
        binding.emailTextView.text = "Your email $email has been activated"
        binding.phoneTextView.text = "Your phone $phone has been registered"
    }
}
