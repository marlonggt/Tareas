package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLetra("los lanister envian sus saludos",'l'));

    }

    public static int getLetra(String cadena, char letra) {
        int cuenta = 0;
        char[] arCadena = cadena.toCharArray();

        System.out.println("cantidad de letra "+letra+": ");

        for (int x = 0; x < cadena.length(); x++) {
            if (arCadena[x] == letra) {
                cuenta++;
            }

            }

            return cuenta;
    }
}
