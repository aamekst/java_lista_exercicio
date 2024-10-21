package com.exercicios.exercicios;

import java.util.Scanner;

public class exec6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = Integer.parseInt(scanner.nextLine());


        int antecessor = num1 - 1;
        int sucessor = num1 + 1;
        System.out.println("O antecessor: " + antecessor);
        System.out.println("O sucessor: " + sucessor);

        scanner.close();
    }

}
