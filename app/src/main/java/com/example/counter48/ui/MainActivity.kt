package com.example.counter48.ui

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.counter48.databinding.ActivityMainBinding
import com.example.counter48.helper.Injector
import com.example.counter48.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter= Injector.getPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()

    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
              presenter.increment()
            }
            decrementBtn.setOnClickListener {
              presenter.decrement()
            }
        }
    }

    override fun updateText(count: Int) {
        binding.counterTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "поздравляем", Toast.LENGTH_SHORT).show()
    }
        override fun changeColor() {
            binding.counterTv.setTextColor(Color.GREEN)

        }
    }
