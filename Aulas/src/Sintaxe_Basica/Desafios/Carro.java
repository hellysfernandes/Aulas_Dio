package Sintaxe_Basica.Desafios;

public class Carro {
    private boolean ligado;
    private int marcha;
    private  int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar() {
        if(ligado == false){
            if(marcha == 0 && velocidade == 0) {
                ligado = true;
            } else {
                System.out.println("Fail: carro não pode ser ligado");
            }
        } else {
            System.out.println("Fail: O Carro ja esta ligado");
        }
    }

    public void desligar() {
        if(ligado == true) {
            if(marcha == 0 && velocidade == 0) {
                ligado = false;
            } else {
                System.out.println("Fail: carro não pode ser desligado");
            }
        } else {
            System.out.println("Fail: O Carro ja esta desligado");
        }
    }

    public void aumentarVelocidade() {
        if(ligado == true) {
            if(marcha > 0) {
                velocidade += 1;
            } else {
                System.out.println("Fail: inposivel de acelerar com a marcha no neutro");
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }

    public void diminuirVelocidade() {
        if(ligado == true) {
            if(marcha > 0) {
                velocidade -= 1;
            } else {
                System.out.println("Fail: inposivel de acelerar com a marcha no neutro");
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }
}