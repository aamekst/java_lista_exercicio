package com.exercicios.exercicios;

import java.util.Scanner;

public class exec14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos Km foi rodado: ");
        double km = sc.nextDouble();

        System.out.print("Para quantos dia o carro foi alugado? ");
        int dia = sc.nextInt();

        double cal_km = 0.20 * km;
        int cal_dia = 90 * dia;
        double total = cal_km + cal_dia;


        System.out.print("O carro fez " + km + " Km/h em " + dia + " dias\n TOTAL R$ " + total);


        sc.close();
        
    }

}
