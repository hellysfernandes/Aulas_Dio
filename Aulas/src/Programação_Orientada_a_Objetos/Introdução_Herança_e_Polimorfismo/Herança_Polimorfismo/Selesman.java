package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo;

public non-sealed class Selesman extends Employee {  // para ser permitida no sealed, a clase tem que ser sealed, non-sealed ou final
    private double porcentPeiSold;

    public Selesman(String code, String name, String address, int age, double salario, double porcentPeiSold) {
        super(code, name, address, age, salario);
        this.porcentPeiSold = porcentPeiSold;
    }

    public Selesman() {

    }

    public double getPorcentPeiSold() {
        return porcentPeiSold;
    }

    public  void setPorcentPeiSold(double porcentPeiSold) {
        this.porcentPeiSold = porcentPeiSold;
    }
}
