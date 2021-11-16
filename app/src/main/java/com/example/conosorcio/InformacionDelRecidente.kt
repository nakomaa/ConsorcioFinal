package com.example.conosorcio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InformacionDelRecidente : AppCompatActivity() { //Esta es la vista en la cual muestra la informacion de los recidentes.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_del_recidente)
        val objetIntent: Intent = intent//creo el objeto intent, el cual  nos va a poder permitir recuperar el objeto que se envia desdede la otra activity
        var piso = intent.getParcelableExtra<Piso>("piso")//con la llave "piso" recupero el objeto piso de la activity anterior
        var departamento = intent.getParcelableExtra<Departamento>("departamento")//con la llave "departamento" recupero el objeto departamento de la activity anterior
        // aqui creo las variables que estan en la vista para luego poder setearlas.
        var TVdepartamento = findViewById<TextView>(R.id.Tw_Departamento)
        var Tvpiso = findViewById<TextView>(R.id.Tw_Piso)
        var nombre = findViewById<TextView>(R.id.TV_Nombre)
        var apellido = findViewById<TextView>(R.id.TV_Apellido)
        var dni = findViewById<TextView>(R.id.TV_Dni)
        var tipoDeRecidente = findViewById<TextView>(R.id.TV_Inquilino_propietario)
        var expensas = findViewById<TextView>(R.id.TV_Expensas)
        var expensasExtraordinarias = findViewById<TextView>(R.id.TV_ExpensasExtraordinarias)
        var alquiler = findViewById<TextView>(R.id.TV_Alquiler)
      Tvpiso.text = piso?.numeroPiso.toString()// aqui setteo el Text View con el piso que esta guardada en la varaiable del objeto piso.
      TVdepartamento.text = departamento?.letraDepartamento// aqui setteo el Text View con la letra de departamento que esta guardada en la varaiable del objeto departamento.
        // Aqui dependiendo de la letra del departamento y del piso se hace la comprobacion con un if y crea los diversos objetos.
        if(piso?.numeroPiso == 1 && departamento?.letraDepartamento == "A" ){ //Aqui se hace la comparacion
            //creacion del objeto.
            var inquilino1A = Inquilino("Martin","Ruiz",5400.0,piso,departamento,22000.0,39353392)
           //aqui se settea los textView
            nombre.text = inquilino1A.nombre
            apellido.text = inquilino1A.apellido
            dni.text = inquilino1A.dni.toString()
            tipoDeRecidente.text = inquilino1A.inquilino
            expensas.text = inquilino1A.expensas.toString()
            expensasExtraordinarias.text = "No tiene"
            alquiler.text = inquilino1A.alquiler.toString()

        }
        if(piso?.numeroPiso == 1 && departamento?.letraDepartamento == "B" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var inquilino1B = Inquilino("Juan","Romero",5400.0,piso,departamento,35000.0,2748945)
            //aqui se settea los textView
            nombre.text = inquilino1B.nombre
            apellido.text = inquilino1B.apellido
            dni.text = inquilino1B.dni.toString()
            tipoDeRecidente.text = inquilino1B.inquilino
            expensas.text = inquilino1B.expensas.toString()
            expensasExtraordinarias.text = "No tiene"
            alquiler.text = inquilino1B.alquiler.toString()
        }
        if(piso?.numeroPiso == 1 && departamento?.letraDepartamento == "C" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var propietario1C = Propietario("Sofia","Juarez",5400.0,piso,departamento,2200.0,3455465)
            //aqui se settea los textView
            nombre.text = propietario1C.nombre
            apellido.text = propietario1C.apellido
            dni.text = propietario1C.dni.toString()
            tipoDeRecidente.text = propietario1C.propietario
            expensas.text = propietario1C.expensas.toString()
            expensasExtraordinarias.text = propietario1C.expensasExtraordianrias.toString()
            alquiler.text = "No tiene"
        }
        if(piso?.numeroPiso == 2 && departamento?.letraDepartamento == "A" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var propietario2A = Propietario ("Leonel","Quintana",5400.0,piso,departamento,2200.0,43212154)
            //aqui se settea los textView
            nombre.text = propietario2A.nombre
            apellido.text = propietario2A.apellido
            dni.text = propietario2A.dni.toString()
            tipoDeRecidente.text = propietario2A.propietario
            expensas.text = propietario2A.expensas.toString()
            expensasExtraordinarias.text = propietario2A.expensasExtraordianrias.toString()
            alquiler.text = "No tiene"
        }
        if(piso?.numeroPiso == 2 && departamento?.letraDepartamento == "B" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var inquilino2B = Inquilino("Lucia","Perez",5400.0,piso,departamento,39000.0,304521548)
            //aqui se settea los textView
            nombre.text = inquilino2B.nombre
            apellido.text = inquilino2B.apellido
            dni.text = inquilino2B.dni.toString()
            tipoDeRecidente.text = inquilino2B.inquilino
            expensas.text = inquilino2B.expensas.toString()
            expensasExtraordinarias.text = "No tiene"
            alquiler.text = inquilino2B.alquiler.toString()
        }
        if(piso?.numeroPiso == 2 && departamento?.letraDepartamento == "C" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var inquilino2C = Inquilino("Pedro","Cristal",5400.0,piso,departamento,23000.0,9863298)
            //aqui se settea los textView
            nombre.text = inquilino2C.nombre
            apellido.text = inquilino2C.apellido
            dni.text = inquilino2C.dni.toString()
            tipoDeRecidente.text = inquilino2C.inquilino
            expensas.text = inquilino2C.expensas.toString()
            expensasExtraordinarias.text = "No tiene"
            alquiler.text = inquilino2C.alquiler.toString()
        }
        if(piso?.numeroPiso == 3 && departamento?.letraDepartamento == "A" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var propietario3A = Propietario ("Cristian","Monte",5400.0,piso,departamento,2200.0,458795152)
            //aqui se settea los textView
            nombre.text = propietario3A.nombre
            apellido.text = propietario3A.apellido
            dni.text = propietario3A.dni.toString()
            tipoDeRecidente.text = propietario3A.propietario
            expensas.text = propietario3A.expensas.toString()
            expensasExtraordinarias.text = propietario3A.expensasExtraordianrias.toString()
            alquiler.text = "No tiene"
        }
        if(piso?.numeroPiso == 3 && departamento?.letraDepartamento == "B" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var propietario3B = Propietario ("Matilde","Rosso",5400.0,piso,departamento,2200.0,432547)
            //aqui se settea los textView
            nombre.text = propietario3B.nombre
            apellido.text = propietario3B.apellido
            dni.text = propietario3B.dni.toString()
            tipoDeRecidente.text = propietario3B.propietario
            expensas.text = propietario3B.expensas.toString()
            expensasExtraordinarias.text = propietario3B.expensasExtraordianrias.toString()
            alquiler.text = "No tiene"
        }
        if(piso?.numeroPiso == 3 && departamento?.letraDepartamento == "C" ){//Aqui se hace la comparacion
            //creacion del objeto.
            var inquilino3C = Inquilino("Sara","Ponce",5400.0,piso,departamento,35000.0,18402312)
            //aqui se settea los textView
            nombre.text = inquilino3C.nombre
            apellido.text = inquilino3C.apellido
            dni.text = inquilino3C.dni.toString()
            tipoDeRecidente.text = inquilino3C.inquilino
            expensas.text = inquilino3C.expensas.toString()
            expensasExtraordinarias.text = "No tiene"
            alquiler.text = inquilino3C.alquiler.toString()
        }






    }
}