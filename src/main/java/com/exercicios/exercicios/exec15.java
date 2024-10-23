package com.exercicios.exercicios;

import java.util.Scanner;

public class exec15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos dias você trabalhou esse mes? ");
        int dias = sc.nextInt();

        double cal_dia = 8 * 25;
        double sal_mes = cal_dia * dias;



        System.out.printf("Você trabalhou " + dias + " dias nesse mês e receberá RS " + sal_mes);


        sc.close();
        
    }

}
