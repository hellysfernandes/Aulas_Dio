package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio1;

public class IngresoMeia extends Ingreso {

    public IngresoMeia(double valorBase, String nomeFilme, String tipoExibicao) {
        super(valorBase, nomeFilme, tipoExibicao);
    }

    @Override
    public double valorFinal() {
        return this.valorBase / 2;
    }
}
