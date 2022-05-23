package com.example.clase1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.clase1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.HOLA.setOnClickListener(){
            Toast.makeText(this, "Hola desde un boton", Toast.LENGTH_LONG).show()
        }
        binding.Adios.setOnClickListener(){
            Toast.makeText(this, "Saliste del sistema", Toast.LENGTH_LONG).show()
        }
    }

}