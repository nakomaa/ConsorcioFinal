package com.example.conosorcio

class Propietario(): Persona(nombre = "", apellido = "", dni = 0)// Aqui la clase inquilino esta heredando
{                                                                // de la clase persona
    //Estas son los atributos diferentes a la clase padre.
    var expensas : Double = 0.0
    var expensasExtraordianrias : Double  = 0.0
    lateinit var  piso: Piso
    lateinit var departamento: Departamento
    val propietario: String = "Propietario"
//constructor
    constructor(nombre: String, apellido: String, expensas: Double, piso: Piso,departamento: Departamento, expensasExtraordianrias:Double, dni: Int):this() {
        this.nombre=nombre
        this.apellido=apellido
        this.expensas=expensas
        this.piso=piso
        this.departamento=departamento
        this.expensasExtraordianrias = expensasExtraordianrias
        this.dni = dni


    }

}