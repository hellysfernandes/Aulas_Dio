package Sintaxe_Basica.Estruturas_De_Controle.Estrutura_De_Condisional;

import java.util.Scanner;

public class CodificacaoIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("digite seu nome");
        String name = input.nextLine();
        System.out.println("diigte sua idade");
        int age = input.nextInt();
        System.out.println("voce é emancipado ?");
        boolean isEmancipado = input.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, voce tem %d anos e pode dirigir \n", name, age);
        } else if (age >= 16 && isEmancipado) {
            System.out.printf("%s, apesar de ter %d anos, voce é emancipado e pode dirigir \n", name, age);
        } else {
            System.out.printf("%s, voce nao pode dirigir \n", name);
        }

        // ou pode ser feiot de outra maneira

        boolean onDrive = (age >= 18) || (age >= 16 && isEmancipado);
        String mensagem;
        if(onDrive) {
            mensagem = name + " voce tem "+ age +" anos e pode dirigir \n";
        } else {
            mensagem = name + " voce nao pode dirigir \n";
        }
        System.out.println(mensagem);

        // podendo ser feito em apenas uma linha de codigo

        String mensagem2 = onDrive ?  name + " voce tem "+ age +" anos e pode dirigir \n" :  name + " voce nao pode dirigir \n";
        System.out.println(mensagem2);
    }
}