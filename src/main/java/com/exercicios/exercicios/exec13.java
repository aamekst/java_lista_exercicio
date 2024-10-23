package com.exercicios.exercicios;

import java.util.Scanner;

public class exec13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        Double sal = sc.nextDouble();

        Double aum = sal + (sal *0.15);

        System.out.print("Seu salario atual é R$ "+sal);
        System.out.printf("\nSeu salario apos o aumento de 15 porcento é R$ %.2f", aum);

        sc.close();
        
    }

}
