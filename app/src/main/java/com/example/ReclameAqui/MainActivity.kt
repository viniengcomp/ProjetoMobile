package com.example.asfaltaaqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.agendaaqui.R
import com.example.agendaaqui.databinding.ActivityMainBinding
//import com.example.AsfaltaAqui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edNome = binding.edUsuario
        val btLogin = binding.btLogin

        btLogin.setOnClickListener {
            if(edNome.text.toString()=="Vinicius") {
                val inten = Intent(this, Tela2Activity::class.java)
                val texto = edNome.text.toString()
                inten.putExtra("nome", texto)
                startActivity(inten)
            }
            else{
                Toast.makeText(this, R.string.msgError, Toast.LENGTH_SHORT).show()
            }
        }
    }
}