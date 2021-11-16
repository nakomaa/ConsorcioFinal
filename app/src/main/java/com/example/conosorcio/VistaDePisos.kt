package com.example.conosorcio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VistaDePisos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_de_pisos)//en esta vista vamos a tener 3 botones de cada piso
        //se guardan los 3 botones en variables.
        var piso1 = findViewById<Button>(R.id.Btn_Piso1)
        var piso2 = findViewById<Button>(R.id.Btn_Piso2)
        var piso3 = findViewById<Button>(R.id.Btn_Piso3)

//dependiendo de que boton se apreta se crea un objeto tipo piso y luego se envia a la otra activity
        piso1.setOnClickListener{
            var piso = Piso(1)//creacion de objeto
            val intent = Intent(this,VistaDepartamentos:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("piso",piso)//guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad
        }
        piso2.setOnClickListener{
            var piso = Piso(2)//creacion de objeto
            val intent = Intent(this,VistaDepartamentos:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("piso",piso)//guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad

        }
        piso3.setOnClickListener{
            var piso = Piso(3)//creacion de objeto
            val intent = Intent(this,VistaDepartamentos:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("piso",piso) //guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad
        }

    }
}