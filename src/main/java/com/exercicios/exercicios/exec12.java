package com.exercicios.exercicios;

import java.util.Scanner;

public class exec12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valor = sc.nextDouble();

        Double promo = valor - (valor *0.05);

        System.out.print("O valor do seu produto R$ "+valor);
        System.out.printf("\nProduto com valor promocional R$ %.2f", promo);

        sc.close();
        
    }

}
