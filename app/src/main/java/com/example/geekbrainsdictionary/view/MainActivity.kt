package com.example.geekbrainsdictionary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geekbrainsdictionary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(binding.mainActivityContainer.id, MainScreenFragment.newInstance())
            .commit()
    }
}