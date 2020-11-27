package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner r = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = r.nextInt();

        for (int i=1; i < 13; i++){

            int mult = num*i;
            System.out.println(num+"x"+i+"= "+mult);

        }

    }
}
