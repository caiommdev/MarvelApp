package com.example.marvelapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelapp.R
import com.example.marvelapp.databinding.ActivityHomeMenuBinding

class HomeMenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_menu)

        binding = ActivityHomeMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()
    }

    private fun setup() {
        val intent = Intent(this,ListCharacterActivity::class.java)
        binding.apply {
            homeMenuButtonCharacters.setOnClickListener {
                startActivity(intent)
            }

            homeMenuButtonSeries.setOnClickListener {
                startActivity(intent)
            }
        }
    }
}