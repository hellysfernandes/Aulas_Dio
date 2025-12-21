package Fundamentos_Da_Linguagem.Exercicio;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("digite seu nome");
        String nome = input.nextLine();
        System.out.println("digite seu ano de nacimento");
        int anoNacimento = input.nextInt();
        int ano = OffsetDateTime.now().getYear();
        int idade = ano - anoNacimento;
        System.out.printf("ola %s voce tem %d anos \n", nome, idade);

        System.out.println("digite o tamnaho de um lado de um quadrado");
        int lado = input.nextInt();
        System.out.printf("a area do quadrado é %d \n", lado * lado);

        System.out.println("digite a base do retangulo");
        int base = input.nextInt();
        System.out.println("digite a altura do retangulo");
        int altura = input.nextInt();
        System.out.printf("a area do seu retangulo é %d ", base * altura);
        input.nextLine();

        System.out.println("digite o primeiro nome");
        String nome1 = input.nextLine();
        System.out.println("digite a idade do " + nome1);
        int idade1 = input.nextInt();
        input.nextLine();
        System.out.println("digite o segundo nome");
        String nome2 = input.nextLine();
        System.out.println("digite a idade do " + nome2);
        int idade2 = input.nextInt();
        System.out.printf("a diferensa de idade do %s e do %s é de %d", nome1, nome2, idade1 - idade2);
    }
}
