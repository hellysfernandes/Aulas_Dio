package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio3;

public class MainTeste {
    public static void main(String[] args) {
        Relogio brlRelogio = new BRLRelogio();
        brlRelogio.setSegundo(0);
        brlRelogio.setMinuto(0);
        brlRelogio.setHora(25);
        System.out.println(brlRelogio.getTempo());

        Relogio usRelogio = new USRelogio();
        System.out.println(usRelogio.convert(brlRelogio).getTempo());

    }
}
