package com.example.spannablesshowcase

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.style.BackgroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import com.example.spannablesshowcase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.btnInvalidate.setOnClickListener {
            invalidateText()
        }
        invalidateText()
    }

    private fun invalidateText() {
        val text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
        val spannable = BackgroundColorSpan(Color.MAGENTA)
        binding.fieldSuggestionsEnabled.setText(text)
        binding.fieldSuggestionsDisabled.setText(text)
        binding.fieldSuggestionsEnabled.text.setSpan(spannable, 22, 35, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        binding.fieldSuggestionsDisabled.text.setSpan(spannable, 22, 35, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
    }
}