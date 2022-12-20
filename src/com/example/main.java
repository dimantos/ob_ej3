package com.example;

/**
 * ConcatenarTextos
 */
public class main {
    public static void main(String[] args){

        String[] nombres = {"Dima", "Alex", "Olya", "Lena", "Oleg", "Katya"};

        String resultado = "";

        for(String nombre : nombres){
            resultado += nombre + " ";
        }
        System.out.println(resultado);
    }
}
