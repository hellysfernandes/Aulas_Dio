package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Exercisio3;

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
        this. maquinaLimpa = true;
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
        if(getMaquinaLimpa()) {
            if(!getTemPet()) {
                temPet = true;
            } else {
                System.out.println("Fail: ja tem um pet na maquina");
            }
        } else {
            System.out.println("fail: a maquina esta suja");
        }
    }

    public void retirarPet() {
        if(getTemPet()) {
            if(!getPetLimpo()) {
                maquinaLimpa = false;
            }
            temPet = false;
        } else {
            System.out.println("nao tem nenhum pet na maquina");
        }
    }

    public void darBanho() {
        if(!getPetLimpo()) {
            if(agua >= 10 && shampoo >= 2) {
                agua -= 10;
                shampoo -= 2;
                petLimpo = true;
            } else {
                System.out.println("Fail: capasidade para limpeza incapaz de completar o banho");
            }
        }
    }

    public void verificarPet() {
        if(getTemPet()) {
            System.out.println("tem pet na maquina");
        } else {
            System.out.println("nao tem pet na maquina");
        }
    }

    public void abastecerAgua() {
       if(agua < 30) {
           agua += 2;
       } else {
           agua = 30;
           System.out.println("limite de agua ja atingido");
       }
    }

    public void abastecerShampoo() {
        if(shampoo < 10){
            shampoo += 2;
        } else {
            shampoo = 10;
            System.out.println("limite de shampoo ja atingido");
        }
    }

    public void limparMaquina() {
        if(!getMaquinaLimpa()) {
            if(getAgua() >= 3 && getShampoo() >= 1) {
                agua -= 3;
                shampoo -= 1;
                maquinaLimpa = true;
            } else {
                System.out.println("Fail: quantidade de produto incapaz de limpar a maquina");
            }
        } else {
            System.out.println("Fail: maquina limpa");
        }
    }

}