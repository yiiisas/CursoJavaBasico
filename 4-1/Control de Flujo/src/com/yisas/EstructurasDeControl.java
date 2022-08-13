package com.yisas;

public class EstructurasDeControl {
    public static void main(String[] args) {
        String[] nombres = {"dfsgaGF", "DSFADSH", "fgfdsgdsfg"};
        String conc = "";
        for (int i=0; i<nombres.length; i++){
            conc += nombres[i];
        }
        /*
        for (String nombre:nombres){
            conc += nombre;
        }
         */
        System.out.println(conc);
    }
}
