package Sintaxe_Basica.Fundamentos_Da_Linguagem;

public class OperadoresBitwise {
    public static void main(String[] args) {

        int n1 = 6;
        String byte1 = Integer.toBinaryString(n1);
        System.out.printf("primeiro numero da opração %d (representação em binario %s) \n", n1, byte1);
        int n2 = 5;
        String byte2 = Integer.toBinaryString(n2);
        System.out.printf("primeiro numero da opração %d (representação em binario %s) \n", n2, byte2);

        int result1 = n1 | n2; // presisa apenas de um valor true para retornar true: 110 | 101 = 111
        String resultByte = Integer.toBinaryString(result1);
        System.out.printf(" %d | %d = %d (representação binaria %s) \n", n1, n2, result1, resultByte);

        int result2 = n1 & n2; // presisa apenas de um valor false para retornar false: 110 & 101 = 100
        String resultByte2 = Integer.toBinaryString(result2);
        System.out.printf(" %d & %d = %d (representação binaria %s) \n", n1, n2, result2, resultByte2);

        int result3 = n1 ^ n2; // numeros diferentes retornal true e numeros iguais retornal false: 110 ^ 101 = 011
        String resultByte3 = Integer.toBinaryString(result3);
        System.out.printf(" %d ^ %d = %d (representação binaria %s) \n", n1, n2, result3, resultByte3);

        int result4 = ~n1; // nega o valor retonando o oposto, onde era false retorna true e onde era true reorna false: ~0000000000000000000000000000110 = 1111111111111111111111111111001
        String resultByte4 = Integer.toBinaryString(result4);
        System.out.printf(" ~%d = %d (representação binaria %s) \n", n1, result4, resultByte4);

        int result5 = n1 << n2; // o segundo valor acresenta a quantidade dita de zeros a direita do valor: 110 << 5 = 11000000
        String resultByte5 = Integer.toBinaryString(result5);
        System.out.printf(" %d << %d = %d (representação binaria %s) \n", n1, n2, result5, resultByte5);

        int result6 = 8 >> 2; // o segundo valor remove a quantidade dita de zeros a direita do valor: 1000 >> 2 = 10
        String resultByte6 = Integer.toBinaryString(result6);
        System.out.printf(" 8 >> 2 = %d (representação binaria %s) \n", result6, resultByte6);

        int result7 = -8 >> 2; // quando o primeiro numero é negativo ele acresenta o segundo valor em 1 na esquerda e apaga a mesma quantidade na direita: 11111111111111111111111111111000 >> 2 = 11111111111111111111111111111110
        String resultByte7 = Integer.toBinaryString(result7);
        System.out.printf(" -8 >> 2 = %d (representação binaria %s) \n", result7, resultByte7);

        int result8 = -12 >>> 2; // o segundo valor diz quantos bytes a esquerda seram apagados e quantos zeros a direita sera adicionados: 11111111111111111111111111110100 >>> 2 = 00111111111111111111111111111101
        String resultByte8 = Integer.toBinaryString(result8);
        System.out.printf(" -12 >>> 2 = %d (representação binaria %s) \n", result8, resultByte8);
    }
}