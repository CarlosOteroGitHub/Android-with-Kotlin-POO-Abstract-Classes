package com.example.myapplicationkootlin

class Serpiente : Animal {

    constructor(nombre:String, color:String) : super(nombre, color);

    override fun clasificacion(): String {
        return "Invertebrado(a)";
    }

    override fun habitat(): String {
        return "Selva/Bosque";
    }
}