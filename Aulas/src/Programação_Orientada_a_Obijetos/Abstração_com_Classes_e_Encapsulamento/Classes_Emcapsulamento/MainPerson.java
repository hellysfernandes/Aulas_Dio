package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Classes_Emcapsulamento;

public class MainPerson {
    public static void main(String[] args) {

        Person.setTest("test 123");

        Person male = new Person();
        male.setName("lucas");
        male.setAge(19);

        Person famele = new Person();
        famele.setName("luna");
        famele.setAge(24);

        System.out.println("male name:" + male.getName() + " age:" + male.getAge() + Person.getTest());
        System.out.println("famele name:" + famele.getName() + " age:" + famele.getAge() + Person.getTest());

    }
}