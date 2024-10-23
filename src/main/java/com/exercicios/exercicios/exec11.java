package com.exercicios.exercicios;

import java.util.Scanner;

public class exec11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite valor do C: ");
        int c = scanner.nextInt();

        int delta = (b*b) - 4*a*c;


        System.out.printf("Delta: " + delta);

        scanner.close();
        
    }

}
