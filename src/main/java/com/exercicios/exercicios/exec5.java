package com.exercicios.exercicios;

import java.util.Scanner;

public class exec5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        Double num1 = Double.valueOf((scanner.nextLine()));

        System.out.print("Digite sua outra media: ");
        Double num2 = Double.valueOf((scanner.nextLine()));

        Double media = (num1 +num2)/2;
        System.out.println("Sua media é: " + media);

        scanner.close();
    }

}
