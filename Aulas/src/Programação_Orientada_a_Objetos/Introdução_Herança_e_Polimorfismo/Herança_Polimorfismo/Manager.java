package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo;

import javax.crypto.spec.PSource;
import java.awt.event.MouseAdapter;

public non-sealed class Manager extends Employee {  // para ser permitida no sealed, a clase tem que ser sealed, non-sealed ou final
    private String login;
    private String passoword;
    private double commission;

    public Manager(String code, String name, String address, int age, double salario, String login, String passoword, double commission) {
        super(code, name, address, age, salario);
        this.login = login;
        this.passoword = passoword;
        this.commission = commission;
    }

    public Manager() {

    }

    public String getLogin() {
        return login;
    }

    public String getPassoword() {
        return passoword;
    }

    public double getCommission() {
        return commission;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
