package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Domain;

public non-sealed class Selesman extends Employee {  // para ser permitida no sealed, a clase tem que ser sealed, non-sealed ou final
    private double porcentPeiSold;
    private double soldAmount;

    /*public Selesman(String code, String name, String address, int age, double salary, double porcentPeiSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.porcentPeiSold = porcentPeiSold;
        this.soldAmount = soldAmount;
    }  */   //sempre que fizer um  costrutor na class pai, presisa instancioar um costrutor nas class filhas

    @Override
    public String getCode() {
        return "SL: " + this.code;
    }

    public double getPorcentPeiSold() {
        return porcentPeiSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setPorcentPeiSold(double porcentPeiSold) {
        this.porcentPeiSold = porcentPeiSold;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((soldAmount * porcentPeiSold) / 100);
    }
}
