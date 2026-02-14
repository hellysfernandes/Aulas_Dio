package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Exercicio3;

import java.util.Scanner;

public class MainPetshop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Petshop petshop = new Petshop();

        while (true) {
            System.out.println("Digite o que deseja:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar o nível de água");
            System.out.println("5 - Verificar o nível de shampoo");
            System.out.println("6 - Verificar se há pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            int escolha = input.nextInt();
            if(escolha == 0) {
                break;
            } else if(escolha == 1) {
                petshop.darBanho();
            } else if(escolha == 2) {
                petshop.abastecerAgua();
            } else if(escolha == 3) {
                petshop.abastecerShampoo();
            } else if(escolha == 4) {
                System.out.println(petshop.getAgua() + " / 30 litros de agua");
            } else if(escolha == 5) {
                System.out.println(petshop.getShampoo() + " / 10 litos de shampoo");
            } else if(escolha == 6) {
                petshop.verificarPet();
            } else if(escolha == 7) {
                petshop.colocarPet();
            } else if(escolha == 8) {
                petshop.retirarPet();
            } else if(escolha == 9) {
                petshop.limparMaquina();
            } else {
                System.out.println("Fail: comando nao encontrado");
            }

        }

    }
}