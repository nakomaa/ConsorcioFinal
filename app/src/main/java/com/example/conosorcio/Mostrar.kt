package com.example.conosorcio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Mostrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar)// en esta activity se va mostrar un mensaje de bienvenida.
        //se guardan los text view y el boton en variables
        var usuario = intent.getParcelableExtra<Usuario>("usuario")//recupero el objeto usuario de la activity anterior
        var TV_nombre = findViewById<TextView>(R.id.TV_Nombre)
        var TV_apellido = findViewById<TextView>(R.id.TV_Apellido)
        var btn_Ingresar = findViewById<Button>(R.id.Btn_Ingresar)

        TV_nombre.text = usuario?.nombre //aqui se settea los textView
        TV_apellido.text = usuario?.apellido //aqui se settea los textView

        btn_Ingresar.setOnClickListener{
          val intent = Intent(this,VistaDePisos:: class.java)//creo el intent y marco a que vista va a ir
          startActivity(intent)//inicio la actividad

        }






    }
}
