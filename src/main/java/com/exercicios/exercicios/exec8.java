package com.exercicios.exercicios;

import java.util.Scanner;

public class exec8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        Double num1 = Double.valueOf((scanner.nextLine()));

        Double cm = num1 * 100;
        Double km = num1 / 1000;
        Double hm = num1/ 100;
        Double dam = num1/10;
        Double dm = num1 *10;
        Double mm = num1 * 1000;

        System.out.println("A distancia de " + num1+"m" + " corresponde a:");
        System.out.println(+km+"km");
        System.out.println(+hm+"hm");
        System.out.println(+dam+"dam");
        System.out.println(+dm+"dm");
        System.out.println(+cm+"cm");
        System.out.println(+mm+"mm");

        scanner.close();
    }

}
