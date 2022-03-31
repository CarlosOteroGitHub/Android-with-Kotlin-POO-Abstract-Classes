package com.example.myapplicationkootlin

/*

Author: Ing. Carlos Otero Ramírez

 */

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() , View.OnClickListener {

    var serpiente_objeto = Serpiente("Anaconda", "Verde");
    var pez_objeto = Pez("Tiburon", "Blanco");

    private var button1:Button ?= null;
    private var button2:Button ?= null;
    private var button3:Button ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Clases Abstractas");

        button1 = findViewById(R.id.AM1_id1);
        button1!!.setOnClickListener(this);

        button2 = findViewById(R.id.AM1_id2);
        button2!!.setOnClickListener(this);

        button3 = findViewById(R.id.AM1_id3);
        button3!!.setOnClickListener(this);
    }

    fun dialogoAlerta(view: View?, mensaje: String){
        val builder = AlertDialog.Builder(this);
        builder.setTitle("Mensaje Informativo!");
        builder.setMessage(mensaje);
        builder.show();
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.AM1_id1 ->
                dialogoAlerta(null, "El pez de nombre " + pez_objeto.getNombre() + " de color " + pez_objeto.getColor() + " esta clasificado como " + pez_objeto.clasificacion() + " el cual vive en el " + pez_objeto.habitat());
            R.id.AM1_id2 ->
                dialogoAlerta(null, "La serpiente de nombre " + serpiente_objeto.getNombre() + " de color " + serpiente_objeto.getColor() + " esta clasificada como " + serpiente_objeto.clasificacion() + " la cual vive en la " + serpiente_objeto.habitat());
            R.id.AM1_id2 ->
                System.exit(0);
        }
    }
}