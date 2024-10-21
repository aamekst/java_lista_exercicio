package com.exercicios.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ola, qual é seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Bem-vinda(a), " + nome );
        scanner.close();
    }

}
