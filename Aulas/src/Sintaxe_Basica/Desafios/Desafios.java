package Sintaxe_Basica.Desafios;

import java.util.Scanner;

public class Desafios {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    String solicitacao = input.nextLine();

    String texto = solicitacao.toLowerCase();
    if (texto.contains("servidor")) {
      System.out.println("EC2");
    } else if (texto.contains("imagens") || texto.contains("videos") ) {
      System.out.println("S3");
    } else if (texto.contains("banco de dados")) {
      System.out.println("RDS");
    } else if (texto.contains("funcoes ")) {
      System.out.println("Lambda");
    } else {
      System.out.println("Servico desconhecido");
    }
  }
}