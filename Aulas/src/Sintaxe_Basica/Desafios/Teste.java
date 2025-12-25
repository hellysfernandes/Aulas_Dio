package Sintaxe_Basica.Desafios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("digite o valor do seu salario");
        float valorSalario = input.nextFloat();

        System.out.println("digite o valor do seu beneficio");
        float valorBeneficio = input.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = valorSalario * 0.05f;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = valorSalario * 0.10f;
        } else if (valorSalario > 2500) {
            valorImposto = valorSalario * 0.15f;
        } else {
            System.out.println("fail: valor invalido");
        }

        float valorFinal = (valorSalario - valorImposto) + valorBeneficio;
        System.out.printf("%.2f \n", valorFinal);
    }
}