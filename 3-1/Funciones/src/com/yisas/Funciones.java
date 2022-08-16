package com.yisas;

public class Funciones {
    public static void main(String[] args) {
       double precioTotal = obtenerPrecioConIVA(120.56, 1.21);
       System.out.println(precioTotal);
    }

    private static double obtenerPrecioConIVA(double precio, double iva) {
        return precio * iva;
    }
}



