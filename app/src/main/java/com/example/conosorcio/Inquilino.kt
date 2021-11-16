package com.example.conosorcio

class Inquilino() : Persona(nombre = "", apellido = "", dni = 0 ) {// Aqui la clase inquilino esta heredando
                                                                   // de la clase persona
    //Estas son los atributos diferentes a la clase padre.
    var alquiler : Double  = 0.0
    var expensas :Double = 0.0
    lateinit var  piso: Piso
    lateinit var departamento: Departamento
    val inquilino : String = "Inquilino"
    //Aca esta el constructor de la clase.
    constructor(nombre: String, apellido: String, expensas: Double, piso: Piso,departamento: Departamento, alquiler: Double, dni:Int):this() {
        this.nombre=nombre
        this.apellido=apellido
        this.expensas=expensas
        this.piso=piso
        this.departamento=departamento
        this.alquiler= alquiler
        this.dni= dni
    }


}