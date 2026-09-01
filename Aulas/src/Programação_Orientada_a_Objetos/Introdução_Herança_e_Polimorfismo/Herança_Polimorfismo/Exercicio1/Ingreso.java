package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio1;

public abstract class Ingreso {
    protected double valorBase;
    protected String nomeFilme;
    protected String tipoExibicao;

    public Ingreso(double valorBase, String nomeFilme, String tipoExibicao) {
        this.valorBase = valorBase;
        this.nomeFilme = nomeFilme;
        this.tipoExibicao = tipoExibicao;
    }

    public abstract double valorFinal();
}
