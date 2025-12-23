package Sintaxe_Basica.Estruturas_De_Controle.Estrutura_De_Repetição;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero para ver a tabuada do mesmo");
        int n1 = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", i, n1, i * n1);
        }

        System.out.println("digite sua altura");
        float altura = input.nextFloat();

        System.out.println("digite seu peso");
        float peso = input.nextFloat();

        float imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("obesidade grau II (severo)");
        } else if (imc >= 40) {
            System.out.println("obesidade grau III (morbida)");
        } else {
            System.out.println("fail: entrada invalida");
        }

        System.out.println("digite um numero");
        int ni = input.nextInt();

        System.out.println("digite outro numero que deve ser maior que o primeiro");
        int nf = input.nextInt();
        input.nextLine();

        System.out.println("escolha entre inpar e par");
        String escolha = input.nextLine();

        for (int i = nf; i >= ni; i--) {
            if (escolha.equals("inpar")) {
                if (i % 2 != 0) System.out.println(i);
            } else if (escolha.equals("par")) {
                if (i % 2 == 0) System.out.println(i);
            } else {
                System.out.println("fail: comando nao encontrado");
            }
        }

        System.out.println("digite um numero");
        int pn = input.nextInt();

        while (true) {
            System.out.println("digite um numero maior que o primeiro");
            int sn = input.nextInt();

            if (sn >= pn) {
                int rest = sn % pn;
                if (rest == 0) {
                    System.out.printf("%d %% %d = %d \n", sn, pn, rest);
                } else {
                    break;
                }
            }
        }

    }
}