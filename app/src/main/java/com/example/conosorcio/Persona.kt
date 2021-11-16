package com.example.conosorcio

abstract class Persona {//Esta es la clase padre de la cual van a heredar propietario e inquilino
 //atributos que se van a heredar de persona
 var nombre : String
 var apellido: String
 var dni : Int = 0

 constructor(nombre: String, apellido: String, dni : Int) {
  this.nombre = nombre
  this.apellido = apellido
  this.dni = dni

 }



}