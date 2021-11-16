package com.example.conosorcio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VistaDepartamentos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_departamentos)//en esta vista vamos a tener 3 botones de cada departamento
        var piso =
            intent.getParcelableExtra<Piso>("piso")//recupero el objeto piso de la activity anterior
        //se guardan los 3 botones en variables.
        var departamentoA = findViewById<Button>(R.id.Btn_DepartamentoA)
        var departamentoB = findViewById<Button>(R.id.Btn_DepartamentoB)
        var departamentoC = findViewById<Button>(R.id.Btn_DepartamentoC)

//dependiendo de que boton se apreta se crea un objeto tipo piso y luego se envia a la otra activity
        departamentoA.setOnClickListener{
            val departamentoa = Departamento ("A")//creacion de objeto
            val intent = Intent(this,InformacionDelRecidente:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("departamento",departamentoa)//guardo con la llave "departamento" el objeto departamento para poder recuperarlo.
            intent.putExtra("piso",piso)//guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad


        }
        departamentoB.setOnClickListener{
            var departamentob = Departamento ("B")//creacion de objeto
            val intent = Intent(this,InformacionDelRecidente:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("departamento",departamentob)//guardo con la llave "departamento" el objeto departamento para poder recuperarlo.
            intent.putExtra("piso",piso)//guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad



        }
        departamentoC.setOnClickListener{
            var departamentoc = Departamento ("C")//creacion de objeto
            val intent = Intent(this,InformacionDelRecidente:: class.java)//creo el intent y marco a que vista va a ir
            intent.putExtra("departamento",departamentoc)//guardo con la llave "departamento" el objeto departamento para poder recuperarlo.
            intent.putExtra("piso",piso)//guardo con la llave "piso" el objeto piso para poder recuperarlo.
            startActivity(intent)//inicio la actividad



        }
    }
}