package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Exercisio2;

import Sintaxe_Basica.Desafios.Carro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carro carro = new Carro();

        while (true) {
            System.out.println("Digite o que deseja");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para a esquerda");
            System.out.println("6 - Virar para a direita");
            System.out.println("7 - Verificar a velocidadde atual");
            System.out.println("8 - Trocar a marcha");

            int escolha = input.nextInt();
            if(escolha == 0) {
                break;
            } else if(escolha == 1) {
                carro.ligar();
            } else if(escolha == 2) {
                carro.desligar();
            } else if(escolha == 3) {
                carro.aumentarVelocidade();
            } else if(escolha == 4) {
                carro.diminuirVelocidade();
            }else {
                System.out.println("Fail: comando não encontrado");
            }
        }

    }
}
