package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Exercicio1;

public class Conta {
    private float saldo;
    private final float chequeEspecial;
    private float usoChequeEspecial;

    public Conta(float depositoInicial){
        this.saldo = depositoInicial;

        if (saldo <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = saldo * 0.5f;
        }

        this.usoChequeEspecial = 0;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public float getChequeEspecial() {
        return  this.chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return usoChequeEspecial > 0;
    }

    public void deposito(float deposito) {
        if(deposito <= 0) {
            System.out.println("fail: valor invalido");
            return;
        }

        if(estaUsandoChequeEspecial()) {
            if(deposito >= usoChequeEspecial){
                float resto = deposito - usoChequeEspecial;
                usoChequeEspecial = 0;
                saldo += resto;
            } else {
                usoChequeEspecial -= deposito;
            }
        } else {
            saldo += deposito;
        }
    }

    public void sacar(float sacar) {
        if(sacar <= 0) {
            System.out.println("fail: valor invalido");
            return;
        }

        float limiteDisponivel = saldo + (chequeEspecial - usoChequeEspecial);

        if(sacar <= saldo) {
            saldo -= sacar;
            System.out.printf("o valor %.2f reias foi sacado com suceso \n", sacar);

        } else if(sacar <= limiteDisponivel){
            float resto = sacar - saldo;
            saldo = 0;
            usoChequeEspecial += resto + (resto * 0.2f);
            System.out.printf("o valor %.2f reias foi sacado com suceso \n", sacar);

        } else {
            System.out.printf("faiol: o valor %.2f reais é maior do que voce tem em sua conta entao nao pode ser sacado \n", sacar);
        }
    }

}