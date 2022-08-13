package com.yisas;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {
        Coche gol = new Coche("gol", 116);
        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());
    }
}
