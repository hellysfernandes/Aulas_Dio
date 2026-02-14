package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Records;

public class MainPerson {
    public static void main(String[] args) {

        Person person = new Person("hellys", 21);
        System.out.println(person);
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.getInfo());

        Person newPerson = new Person(person.name(), 23);
        System.out.println(newPerson);
        System.out.println(newPerson.name());
        System.out.println(newPerson.age());
        System.out.println(newPerson.getInfo());

    }
}