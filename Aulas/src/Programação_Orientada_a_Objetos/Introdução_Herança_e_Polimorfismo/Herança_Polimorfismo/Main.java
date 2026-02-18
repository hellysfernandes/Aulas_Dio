package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Hellys");
        manager.setLogin("hellys");
        manager.setPassword("12345678");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

        Employee managerr = new Manager();
        managerr.setName("Hellys");

        System.out.println(managerr.getName());
    }
}