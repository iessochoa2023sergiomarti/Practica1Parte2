package net.iessochoa.practica1parte2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HiActivity : AppCompatActivity() {

    companion object {
        // Clave que permite recibir un texto que mostrará en pantalla
        val EXTRA_PASSWORD = "practica1parte2.HiActivity.name"
    }

    private lateinit var tvWelcome:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi)

        tvWelcome = findViewById(R.id.tvWelcome)

        val password = intent.getStringExtra(EXTRA_PASSWORD)
        if (password.toString() == "1234") {
            tvWelcome.text = R.string.welcome.toString()
        }
    }
}