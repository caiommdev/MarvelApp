package com.example.marvelapp.ui.characters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelapp.databinding.ActivityCharacterDetailsBinding

class CharacterDetailsActivity : AppCompatActivity() {

    val character by lazy{
        intent?.extras?.getSerializable(CHARACTER)
    }

    lateinit var binding: ActivityCharacterDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharacterDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        const val CHARACTER = "character"
    }
}