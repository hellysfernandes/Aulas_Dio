package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Exercisio1;

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

    public boolean getUsoChequeEspecial() {
        if(this.usoChequeEspecial > 0){
            return true;
        }
        return false;
    }

    public void deposito(float deposito) {
        this.saldo += deposito;
    }

    public void sacar(float sacar) {
        if(sacar <= this.saldo) {
            this.saldo -= sacar;
            System.out.printf("o valor %.2f reias foi sacado com suceso \n", sacar);

        } else if(sacar <= this.chequeEspecial){
            float resto = sacar - this.saldo;
            this.saldo = 0;
            this.usoChequeEspecial += resto;
            System.out.printf("o valor %.2f reias foi sacado com suceso \n", sacar);

        } else {
            System.out.printf("o valor %.2f reais é maior do que voce tem em sua conta entao nao pode ser sacado \n", sacar);
        }
    }

}