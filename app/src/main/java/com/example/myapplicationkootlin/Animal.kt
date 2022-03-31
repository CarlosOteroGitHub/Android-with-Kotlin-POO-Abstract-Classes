package com.example.myapplicationkootlin

open abstract class Animal {

    private final var nombre:String = "";
    private final var color:String = "";

    constructor(nombre:String, color:String){
        this.nombre = nombre;
        this.color = color;
    }

    fun getNombre():String {
        return nombre;
    }

    fun getColor():String {
        return color;
    }

    abstract fun clasificacion():String;

    abstract fun habitat():String;
}