package com.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {

        double price = getPrice(121.00);

        System.out.println(price);

    }

    private static double getPrice(double price) {
        double iva = price*0.18;
        return price + iva;
    }

}
