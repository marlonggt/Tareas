package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        funPrin();

        /*System.out.println("libras a Kilogramos: "+getMasa(+20));
        System.out.println("kilometros a millas: "+getVelocidad(50));*/

    }
    //Funcion principal
    public static void funPrin(){

        getMenu();
        Scanner rd = new Scanner(System.in);

        int num = getInt(rd);

        if(num == 1){
            System.out.println("ingrese la cantidad de libras:");
            System.out.println("libras a Kilogramos: "+getMasa(getDouble(rd)));
        } else if(num == 2){
            System.out.println("ingrese la cantidad de kilometros:");
            System.out.println("kilometros a millas: "+getVelocidad(getDouble(rd)));
        }else{
            System.out.println("numero no valido");
        }


    }

    //funcion para menu
    public static void getMenu(){
        System.out.println("1. convertir libras a kilogramos");
        System.out.println("2. convertir kilometros a millas");
    }
    
    //leer una String
    public static String getString(Scanner n){
        String a = n.nextLine();
        return a;
    }

    //leer un int
    public static int getInt(Scanner rd){
        int num = rd.nextInt();
        return num;
    }

    //leer un double
    public static double getDouble(Scanner rd){
        double num = rd.nextDouble();
        return num;
    }

    //funcion convertir valores de masa
    public static double getMasa(double lb){
        System.out.println(lb);
        double kilogramos = lb / 2.2;
        return kilogramos;
    }

    //funcion convertir valores de velocidad
    public static double getVelocidad(double km){
        System.out.println(km);
        double millas = km * 0.62137;
        return millas;
    }
}


