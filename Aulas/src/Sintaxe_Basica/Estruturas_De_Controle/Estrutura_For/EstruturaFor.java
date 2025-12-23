package Sintaxe_Basica.Estruturas_De_Controle.Estrutura_For;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < args.length ; i++) {
            System.out.println( i + " - " + args[i]);
        }

    }
}