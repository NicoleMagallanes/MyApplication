package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
            binding = ActivitySignUpBinding.inflate(layoutInflater)
            setContentView(binding.root)
        binding.btnSignup.setOnClickListener {
            var errorCount = 0
            if (binding.etEmail.text.isNullOrBlank()) {
                errorCount++
                binding.etEmail.error = "This field is required"
            }
            if (binding.etPassword.text.isNullOrBlank()) {
                errorCount++
                binding.etPassword.error = "This field is required"

            }
            if(binding.etRepeatPassword.text.isNullOrBlank()){
                errorCount++
                binding.etRepeatPassword.error="This field is required"
            }
            if(binding.etName.text.isNullOrBlank()){
                errorCount++
                binding.etName.error="This field is required"
            }
            if(binding.etPhone.text.isNullOrBlank()){
                errorCount++
                binding.etPhone.error="This field is required"
            }
            if(errorCount <= 0){
                verifyLogin(binding.etEmail.text.toString(), binding.etPassword.text.toString())
                //TODO
            }
        }
        binding.btnSignup.setOnClickListener{
            val intent = Intent(this@SignUpActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
    private fun verifyLogin(email: String, password: String): Boolean {
        return true

    }
}