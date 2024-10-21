package com.exercicios.exercicios;

import java.util.Scanner;

public class exec10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Largura: ");
        Double largura = Double.valueOf((scanner.nextLine()));

        System.out.print("Altura: ");
        Double altura = Double.valueOf((scanner.nextLine()));

        Double calculo_parede = altura * largura;
        Double qtd_tinta = calculo_parede/2;


        System.out.printf("Cálculo da parede: %.2f m²%n", calculo_parede);
        System.out.println(String.format("Você precisará de %.2f litros", qtd_tinta));
        scanner.close();
    }

}
