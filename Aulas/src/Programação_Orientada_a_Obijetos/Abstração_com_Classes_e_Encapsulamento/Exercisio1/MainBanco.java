package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Exercisio1;

import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o saudo inicial");
        float saudoInicial = input.nextFloat();
        Conta conta = new Conta(saudoInicial);

        while (true) {
            System.out.println("digite o que deseja");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - sair do banco");
            int escolha = input.nextInt();

            if(escolha == 0) {
                break;
            } else if (escolha == 1) {
                System.out.println(conta.getSaldo());
            } else if (escolha == 2) {
                System.out.println(conta.getChequeEspecial());
            } else if (escolha == 3) {
                System.out.println("difite o valor que deseja depositar");
                float deposito = input.nextFloat();
                conta.deposito(deposito);

            } else if (escolha == 4) {
                System.out.println("digite o valor que deseja sacar");
                float sacar = input.nextFloat();
                conta.sacar(sacar);

            } else if (escolha == 5) {
                System.out.println("digite o valor do boleta a ser pago");
                float valor = input.nextFloat();
                conta.sacar(valor);

            } else if (escolha == 6) {
                System.out.println(conta.getUsoChequeEspecial());
            } else {
                System.out.println("fail: comando não encontrado");
            }

        }
    }
}