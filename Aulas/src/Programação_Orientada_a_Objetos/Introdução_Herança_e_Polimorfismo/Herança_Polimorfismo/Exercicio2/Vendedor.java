package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio2;

public class Vendedor extends Usuario {
    private int quantVendasRealizada;

    public Vendedor(String nome, String email, String senha, int quantVendasRealizada) {
        super(nome, email, senha, false);
        this.quantVendasRealizada = quantVendasRealizada;
    }

    public int getQuantVendasRealizada() {
        return this.quantVendasRealizada;
    }

    public void realizarVenda() {
        this.quantVendasRealizada++;
        System.out.println("venda realizada");
    }

    @Override
    public void consultarVendas() {
        System.out.println("Vendedor Consultar vendas");
    }

    @Override
    public void realizarLogin() {
        System.out.println("Vendedor Realizar login");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Vendedor Realizar logoff");
    }

    @Override
    public void alterarDadosCadastrais(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println(" VendedorAlterar dados cadastrais");
    }

    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Vendedor Alterar senha");
    }

}
