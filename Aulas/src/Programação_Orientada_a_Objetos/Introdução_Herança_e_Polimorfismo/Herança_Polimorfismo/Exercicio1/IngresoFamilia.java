package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio1;

public class IngresoFamilia extends Ingreso {
    private int quantPessoas;

    public IngresoFamilia(double valorBase, String nomeFilme, String tipoExibicao, int quantPessoas) {
        super(valorBase, nomeFilme, tipoExibicao);
        this.quantPessoas = quantPessoas;
    }

    @Override
    public double valorFinal() {
        double total = this.valorBase * this.quantPessoas;

        if (quantPessoas < 0) {
            System.out.println("valor invalido");
            return 0;
        }

        if (quantPessoas > 3) {
            return total * 0.95;
        }

        return total;
    }
}
