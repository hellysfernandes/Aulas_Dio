package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio2;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean eAdimionistrador;

    public Usuario(String nome, String email, String senha, boolean eAdimionistrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eAdimionistrador = eAdimionistrador;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean getEAdimionistrador() {
        return this.eAdimionistrador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void consultarVendas() {
        System.out.println("Consultar vendas");
    }

    public void realizarLogin() {
        System.out.println("Realizar login");
    }

    public void realizarLogoff() {
        System.out.println("Realizar logoff");
    }

    public void alterarDadosCadastrais(String novoNome, String novoEmail) {
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Alterar dados cadastrais");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Alterar senha");
    }
}
