package com.exercicios.exercicios;

import java.util.Scanner;

public class exec4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite outro valor: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        int soma = num1 +num2;
        System.out.println("A soma: " + soma);

        scanner.close();
    }

}
