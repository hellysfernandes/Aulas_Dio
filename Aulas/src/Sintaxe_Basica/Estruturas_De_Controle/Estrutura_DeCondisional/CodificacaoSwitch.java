package Sintaxe_Basica.Estruturas_De_Controle.Estrutura_DeCondisional;

import java.util.Scanner;

public class CodificacaoSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("digite um numero de 1 a 7");
        int option = input.nextInt();
        switch (option) {
            case 1, 7:
                String day = option == 1 ? "domingo" : "sabado";
                System.out.printf("hoje é %s, fim de semna \n", day);
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            default:
                System.out.println("fail: comando invalido");
                break;
        }

        switch (option) {
            case 1,7 -> {
                String day = option == 1 ? "domingo" : "sabado";
                System.out.printf("hoje é %s, fim de semna \n", day);
            }
            case 2 -> System.out.println("segunda");
            case 3 -> System.out.println("rweça");
            case 4 -> System.out.println("quarta");
            case 5 -> System.out.println("quinta");
            case 6 -> System.out.println("sexta");
            default -> System.out.println("fail: comando invalido");
        }

        String mensagem = switch (option) {
            case 1, 7 -> {
                String day = option == 1 ? "domingo" : "sabado";
                yield String.format("hoje é %s, fim de semna \n", day);
            }
            case 2 -> "segunda";
            case 3 -> "rweça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            default -> "fail: comando invalido";
        };
        System.out.println(mensagem);
    }
}
