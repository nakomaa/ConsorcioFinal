package com.example.conosorcio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//En esta activity vamos a tenr una bienvenida y 2 editext para ingresar a la app
    val usuario  = Usuario ("roberto","abadia")//creacion de obejto usuario
    //se guardan el botones y las Editext en variables.
    val nombre = findViewById<EditText>(R.id.etNombre)
    val apellido = findViewById<EditText>(R.id.etApellido)
    val Botoni = findViewById<Button>(R.id.btnIngresar)

        fun ingresar (usuario: Usuario){// esta funcion permite ingresar y pasar a la otra activity
            val intent = Intent(this,Mostrar:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("usuario",usuario)//guardo con la llave "usuario" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad

        }
        Botoni.setOnClickListener{
            var ConvertirEdNombre = nombre.text.toString()//convierto el text view en String
            var convertirEdApellido = apellido.text.toString()//convierto el text view en String
            if (ConvertirEdNombre == usuario.nombre  &&  convertirEdApellido == usuario.apellido){//comparo si lo que esta en el editext sea lo mismo que hay en el obejto.
                ingresar(usuario)//llamo a la funcio y le envio el objeto usuario
            }
            else {
                Toast.makeText(this, "El nombre y el apellido no coinciden", Toast.LENGTH_SHORT).show()//menasje de erro.
            }
        }
           }
        }


