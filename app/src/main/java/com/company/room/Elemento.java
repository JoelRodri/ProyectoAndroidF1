package com.company.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Elemento {
    @PrimaryKey(autoGenerate = true)
    int id;

    int imagen;
    String posicion;
    String nombre;
    String descripcionForzada;
    String descripcion;
    float valoracion;

    public Elemento(int imagen, String posicion, String nombre, String descripcionForzada, String descripcion) {
        this.imagen = imagen;
        this.posicion = posicion;
        this.nombre = nombre;
        this.descripcionForzada = descripcionForzada;
        this.descripcion = descripcion;
    }
}
