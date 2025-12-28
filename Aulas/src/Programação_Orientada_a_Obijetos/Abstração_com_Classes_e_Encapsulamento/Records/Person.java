package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Records;

public record Person(String name, int age) {

    public Person(String name) {
        this(name, 0);
    }

    public String getInfo() {
        return "nome: " +name+ " idade: " +age;
    }

}
