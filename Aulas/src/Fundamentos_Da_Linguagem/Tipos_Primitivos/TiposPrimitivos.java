package Fundamentos_Da_Linguagem.Tipos_Primitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // tipoos de variaveis primitivas:
        byte idadeByte = 20;                  // 1 byte (-128 a 127);
        short idadeShort = 20;                // 2 byte (-32768 a 32767);
        int idadeInt = 20;                    // 4 byte (-2147483648 a 2147483648);
        long idadeLong = 2734784378423340L;   // 8 byte (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807) / numeros grandes tem de ter um "L" no final;
        float salarioFloat = 567865.765f;     // 4 byte (ate 7 numeros apoos a vigula);
        double salariooDouble = 34.5634;      // 8 byte (ate 15 numeros apoos a vigula);
        char letras = 'S';                    // 2 byte (apenas um caractere) / pode ser feito com a tabela (unicode) e (ascii).
        boolean verdadeiro = true;            // 1 byte (true) ou (false).
        boolean falso = false;                // 1 byte (true) ou (false).

        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(idadeInt);
        System.out.println(idadeLong);
        System.out.println(salarioFloat);
        System.out.println(salariooDouble);
        System.out.println(letras);
        System.out.println(verdadeiro);
        System.out.println(falso);

        // (casting) forca um valor entrar em outra variavel usando "()" EX: (variavel escolhida);
        int forca = (int) 10000000000L; // valor lng dentroo de um int.
        long forca1 = (long) 324.456;   // valor double dentro de um long.

        System.out.println(forca);
        System.out.println(forca1);

        // String:
        String nome = "herllys fernandes barbosa";

        System.out.println("seu nome é " + nome);
    }
}