package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Forma que da erro por conta do polimorfismo

        // Employee employee = new Employee(); qunado uma class é abistrata dela nao pode ser extansiada
        // Employee maneger = new Maneger();

        // maneger.setName("Hellys");
        //maneger.setLogin("Hellys@"); // como o maneger foi declarado como Employee, ele nao pode usar coisas da Manager
        //maneger.setPassoword("123"); // como o maneger foi declarado como Employee, ele nao pode usar coisas da Manager

        // System.out.println(maneger.getName());
        //System.out.println(maneger.getLogin());      // como o maneger foi declarado como Employee, ele nao pode usar coisas da Manager
        //System.out.println(maneger.getPassoword());  // como o maneger foi declarado como Employee, ele nao pode usar coisas da Manager

        // forma de resolver
        printEmployy(new Manager());
        printEmployy(new Selesman());
    }

    public static void printEmployy(Employee employee) {

        System.out.printf("====%s====\n", employee.getClass().getCanonicalName());
         switch (employee) {
            case Manager manager -> {
                manager.setCode("1234");
                manager.setName("Hellys");
                manager.setSalario(5000);
                manager.setLogin("Hellys@");
                manager.setPassoword("123");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalario());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassoword());
                System.out.println(manager.getCommission());
            }
            case Selesman selesman -> {
                selesman.setCode("123345");
                selesman.setName("hylis");
                selesman.setSalario(3000);
                selesman.setPorcentPeiSold(10);

                System.out.println(selesman.getCode());
                System.out.println(selesman.getName());
                System.out.println(selesman.getSalario());
                System.out.println(selesman.getPorcentPeiSold());
            }
        }
    }

}