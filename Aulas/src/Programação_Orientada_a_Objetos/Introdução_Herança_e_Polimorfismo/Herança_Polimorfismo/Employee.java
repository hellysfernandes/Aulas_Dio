package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo;

public sealed abstract class Employee permits Manager, Selesman{ // sealed permite selar a clas e permitir apenas classes expesificas que presisan ter non-sealed para serem permitidas
    private String code;
    private String name;
    private String address;
    private int age;
    private double salario;

    public Employee(String code, String name, String address, int age, double salario) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salario = salario;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public double getSalario() {
        return salario;
    }

    public  void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address =address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}