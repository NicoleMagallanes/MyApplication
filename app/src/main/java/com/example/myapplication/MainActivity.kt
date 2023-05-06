package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var errorCount = 0
            if (binding.EmailBox.text.isNullOrBlank()) {
                errorCount++
                binding.EmailBox.error = "This field is required"
            }
            if (binding.PasswordBox.text.isNullOrBlank()) {
                errorCount++
                binding.PasswordBox.error = "This field is required"

            }
            if(errorCount <= 0){
                verifyLogin(binding.EmailBox.text.toString(), binding.PasswordBox.text.toString())
                //TODO
            }
        }
        binding.button2.setOnClickListener{
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
    private fun verifyLogin(email: String, password: String): Boolean {
        return true
    }
}

