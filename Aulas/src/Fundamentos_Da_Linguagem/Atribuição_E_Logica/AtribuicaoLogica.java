package Fundamentos_Da_Linguagem.Atribuição_E_Logica;

import java.util.Scanner;

public class AtribuicaoLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("quanto é 2 + 2");
        String result = input.next();
        boolean real = result == "4";
        System.out.println("o resultado é 4 e voce acertou (" +real+")");


    }
}
