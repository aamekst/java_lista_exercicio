package com.exercicios.exercicios;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ola, qual é seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Ola, qual é seu salário: ");
        Double preco = Double.valueOf(scanner.nextLine());

        System.out.println("O funcionario(a) " + nome + " tem um salario de " + preco + " em " + currentMonth);
        scanner.close();
    }

}
