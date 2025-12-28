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
            this.chequeEspecial = (saldo /2) * 0.5f;
        }

        this.usoChequeEspecial = 0;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void deposito(float deposito) {
        this.saldo += deposito;
    }

}