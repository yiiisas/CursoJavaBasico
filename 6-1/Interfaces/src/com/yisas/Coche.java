package com.yisas;

public class Coche {
    String nombre;
    int motor;

    public Coche(String nombre, int motor) {
        this.nombre = nombre;
        this.motor = motor;
    }

    public Coche() {

    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", motor=" + motor +
                '}';
    }
}
