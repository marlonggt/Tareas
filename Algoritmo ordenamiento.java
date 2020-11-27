package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// Ordenamiento por Insercion

        int arreglo[], num, pos, aux;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ordenar"));

        arreglo = new int[num];

        for(int i = 0; i<num; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+":"));
        }

        for(int i = 0; i<num; i++){
            pos = i;
            aux = arreglo[i];

            while((pos>0) && (arreglo[pos-1] < aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }


        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));


    }
}
