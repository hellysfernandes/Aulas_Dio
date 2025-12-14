package Fundamentos_Da_Linguagem.Atribuição_E_Logica;

import java.util.Scanner;

public class AtribuicaoLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("quanto é 2 + 2");
        int result = input.nextInt();
        boolean real = result == 4;
        System.out.println("o resultado é 4 e voce acertou (" + real + ")");

        System.out.println("quantos anos voce tem ?");
        int idade = input.nextInt();
        System.out.println("voce é emancipado ?");
        boolean isEmancipado = input.nextBoolean();
        boolean drive = idade >= 18 || (isEmancipado && idade >= 16);
        System.out.println("voce pode dirigir (" + drive + ")");

        System.out.println("====================================");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && false = " + (false && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("====================================");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || false = " + (false || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("=====================================");
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);
    }
}