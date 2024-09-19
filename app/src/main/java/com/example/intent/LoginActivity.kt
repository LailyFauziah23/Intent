package com.example.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intent.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the data passed from RegisterActivity
        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val phone = intent.getStringExtra("PHONE")

        binding.loginButton.setOnClickListener {
            // Passing the same data to HomeActivity
            val intent = Intent(this, HomeActivity::class.java).apply {
                putExtra("USERNAME", username)
                putExtra("EMAIL", email)
                putExtra("PHONE", phone)
            }
            startActivity(intent)
        }
    }
}
