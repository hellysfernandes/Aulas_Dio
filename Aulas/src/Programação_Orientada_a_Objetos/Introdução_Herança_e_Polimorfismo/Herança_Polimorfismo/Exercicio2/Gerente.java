package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio2;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerar relatório financeiro");
    }

    @Override
    public void consultarVendas() {
        System.out.println("Gerente Consultar vendas");
    }

    @Override
    public void realizarLogin() {
        System.out.println("Gerente Realizar login");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Gerente Realizar logoff");
    }

    @Override
    public void alterarDadosCadastrais(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Gerente Alterar dados cadastrais");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Gerente Alterar senha");
    }

}
