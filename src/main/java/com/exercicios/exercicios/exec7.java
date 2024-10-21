package com.exercicios.exercicios;

import java.util.Scanner;

public class exec7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        Double num1 = Double.valueOf((scanner.nextLine()));

        Double dobro = num1 * 2;
        Double terco = num1/3;
        System.out.println("O dobro de " +num1 + " é: " + dobro);
        System.out.println("O terço de " +num1 + " é: " + terco);

        scanner.close();
    }

}
