package Fundamentos_Da_Linguagem.Operadores_aritimeticos;

import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1 = input.nextInt();
        System.out.println("digite um segundo numero");
        int n2 = input.nextInt();
        System.out.printf("%d + %d = %d \n", n1, n2, (n1 + n2));
        System.out.printf("%d - %d = %d \n", n1, n2, (n1 - n2));
        System.out.printf("%d %% %d = %d \n", n1, n2, (n1 % n2));

        System.out.println("digite main um numero");
        float n3 = input.nextFloat();
        System.out.println("digite um outro numero");
        float n4 = input.nextFloat();
        System.out.printf("%.2f / %.2f = %.2f \n", n3, n4, (n3 / n4));
        System.out.printf("%.2f * %.2f = %.2f \n", n3, n4, (n3 * n4));

        System.out.println("digite um numero");
        float n5 = input.nextFloat();
        System.out.printf("a rais quadrada de %.2f é %.2f \n", n5, Math.sqrt(n5));
        System.out.printf("%.2f elevado ao quadrado é %.2f \n", n5, Math.pow(n5, 2));
        System.out.printf("%.2f elevado ao cubo é %.2f \n", n5, Math.pow(n5, 3));

    }
}
