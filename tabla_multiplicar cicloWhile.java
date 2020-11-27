package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code herem
        Scanner r = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = r.nextInt();
        int x = 1;

        while (num < 13 && num > 0){
            if(x == 13){
                x = 1;
                num = r.nextInt();
            }

            int mult = num*x;
            System.out.println(num+"x"+x+"= "+mult);
            x++;
        }

    }
}
