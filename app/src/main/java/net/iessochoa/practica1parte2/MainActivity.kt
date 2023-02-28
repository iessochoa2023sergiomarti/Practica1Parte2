package net.iessochoa.practica1parte2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etPassword:EditText

    private lateinit var btCheck:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignamos a los campos de la clase los elementos de la aplicación
        etPassword = findViewById(R.id.etPassword)
        btCheck = findViewById(R.id.btCheck)

        // Le asignamos la función "sendPassword" a la acción del botón "btCheck"
        btCheck.setOnClickListener{}
    }

    private fun sendPassword() {
        if (!etPassword.text.isEmpty()) {
            val intent = Intent(this, HiActivity::class.java)
            intent.putExtra(HiActivity.EXTRA_PASSWORD, etPassword.text.toString())
            startActivity(intent)
        } else {
            Toast.makeText(this, R.string.warning_no_password, Toast.LENGTH_LONG).show()
        }
    }
}