package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio2;

public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa() {
        return this.valorEmCaixa;
    }

    public void receberPagamentos(double valor) {
        this.valorEmCaixa += valor;
        System.out.println("receber pagamento");
    }

    public void fecharCaixa() {
        System.out.println("fechar caixa");
    }

    @Override
    public void consultarVendas() {
        System.out.println("Atendente Consultar vendas");
    }

    @Override
    public void realizarLogin() {
        System.out.println("Atendente Realizar login");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Atendente Realizar logoff");
    }

    @Override
    public void alterarDadosCadastrais(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Atendente Alterar dados cadastrais");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Atendente Alterar senha");
    }

}
