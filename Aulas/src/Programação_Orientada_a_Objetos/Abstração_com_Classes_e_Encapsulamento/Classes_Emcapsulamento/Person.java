package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Classes_Emcapsulamento;

import java.time.OffsetDateTime;

public class Person {
    
    private String name;
    private int age;
    private static String test;
    private int lestYearAgeIon = OffsetDateTime.now().getYear();

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setTest(String testParam) {
        test = testParam;  // variaveis estaticas nao sao asesadas pelo "this", por isso nao pode usar o mesmo nome
    }

    public static String getTest() {
        return test;
    }

    public void incAge() {
        if (this.lestYearAgeIon >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lestYearAgeIon = OffsetDateTime.now().getYear();
    }
}