package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Exercicio3;

public class Petshop {
    private int agua;
    private int shampoo;
    private boolean temPet;
    private boolean petLimpo;
    private boolean maquinaLimpa;

    public Petshop() {
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.petLimpo = false;
        this.maquinaLimpa = true;
    }

    public int getAgua() {
        return this.agua;
    }

    public int getShampoo() {
        return this.shampoo;
    }

    public boolean getTemPet() {
        return this.temPet;
    }

    public boolean getPetLimpo() {
        return this.petLimpo;
    }

    public boolean getMaquinaLimpa() {
        return this.maquinaLimpa;
    }

    public void colocarPet() {
        if(!getMaquinaLimpa()) {
            System.out.println("fail: a maquina esta suja");
            return;
        }

        if(getTemPet()) {
            System.out.println("fail: ja tem um pet na maquina");
            return;
        }

        temPet = true;
        petLimpo = false;
    }

    public void retirarPet() {
        if(getTemPet()) {
            if(!getPetLimpo()) {
                maquinaLimpa = false;
            }
            temPet = false;
        } else {
            System.out.println("fail: nao tem nenhum pet na maquina");
        }
    }

    public void darBanho() {
        if(!getTemPet()){
            System.out.println("fail: nao tem nenhum pet para dar banho");
            return;
        }

        if(getPetLimpo()) {
            System.out.println("fail: o pet ja esta limpo");
            return;
        }

        if(agua >= 10 && shampoo >= 2) {
            agua -= 10;
            shampoo -= 2;
            petLimpo = true;
        } else {
            System.out.println("fail: capasidade para limpeza incapaz de completar o banho");
        }
    }

    public void verificarPet() {
        if(getTemPet()) {
            System.out.println("fail: tem pet na maquina");
        } else {
            System.out.println("fail: nao tem pet na maquina");
        }
    }

    public void abastecerAgua() {
       if(agua < 30) {
           agua += 2;
       } else {
           agua = 30;
           System.out.println("fail: limite de agua ja atingido");
       }
    }

    public void abastecerShampoo() {
        if(shampoo < 10){
            shampoo += 2;
        } else {
            shampoo = 10;
            System.out.println("fail: limite de shampoo ja atingido");
        }
    }

    public void limparMaquina() {
        if(!getMaquinaLimpa()) {
            if(getAgua() >= 3 && getShampoo() >= 1) {
                agua -= 3;
                shampoo -= 1;
                maquinaLimpa = true;
            } else {
                System.out.println("fail: quantidade de produto incapaz de limpar a maquina");
            }
        } else {
            System.out.println("fail: maquina limpa");
        }
    }

}