package Sintaxe_Basica.Estruturas_De_Controle.Estrutura_While;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String nome = "";

        while (!nome.equals("exit")) {
            System.out.println("digite um nome");
            nome = input.nextLine();
            System.out.println(nome);
        }

        do {
            System.out.println("digite um nome");
            nome = input.nextLine();
            System.out.println(nome);
        } while (!nome.equals("exit"));
    }
}
