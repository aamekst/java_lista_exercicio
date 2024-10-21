package com.exercicios.exercicios;

import java.util.Scanner;

public class exec9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos reais você tem na carteira R$ : ");
        Double num1 = Double.valueOf((scanner.nextLine()));

        Double dolar = 3.45;
        int cotacao = (int) (num1/dolar);
        double sub = num1 - (dolar * cotacao) ;



        System.out.println("Você pode compra " + cotacao + " dolar");
        System.out.println("Sobrou R$ " +sub );
        scanner.close();
    }

}
