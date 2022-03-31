package com.example.myapplicationkootlin

class Pez : Animal {

    constructor(nombre:String, color:String) : super(nombre, color);

    override fun clasificacion(): String {
        return "Vertebrado(a)";
    }

    override fun habitat(): String {
        return "Mar";
    }
}