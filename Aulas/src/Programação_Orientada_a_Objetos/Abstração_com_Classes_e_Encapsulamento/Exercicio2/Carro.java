package Programação_Orientada_a_Objetos.Abstração_com_Classes_e_Encapsulamento.Exercicio2;

public class Carro {
    private boolean ligado;
    private int marcha;
    private  int velocidade;
    private static  final int acelerar  = 1;
    private static final int frear = -1;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void ligar() {
        if(!getLigado()){
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
        if(getLigado()) {
            if(marcha == 0 && velocidade == 0) {
                ligado = false;
            } else {
                System.out.println("Fail: carro não pode ser desligado");
            }
        } else {
            System.out.println("Fail: O Carro ja esta desligado");
        }
    }

    private boolean velocidadeDentroDoLimite(int min, int max) {
        return velocidade >= min && velocidade < max;
    }

    private void alterarVelocidade(int min, int max, int valor) {
        if (!velocidadeDentroDoLimite(min, max)) {
            System.out.println("Fail: limite de velocidade atingido");
            return;
        }

        if (valor == acelerar) {
            velocidade++;
        } else if (valor == frear) {
            if (velocidade > 0) {
                velocidade--;
            }
        } else {
            System.out.println("Fail: comando invalido");
        }
    }


    public void velocidade(int valor) {
        if (!getLigado()) {
            System.out.println("Fail: O Carro precisa ser ligado antes");
            return;
        }

        switch (marcha) {
            case 1:
                alterarVelocidade(0, 20, valor);
                break;

            case 2:
                alterarVelocidade(20, 40, valor);
                break;

            case 3:
                alterarVelocidade(40, 60, valor);
                break;

            case 4:
                alterarVelocidade(60, 80, valor);
                break;

            case 5:
                alterarVelocidade(80, 100, valor);
                break;

            case 6:
                alterarVelocidade(100, 120, valor);
                break;

            default:
                System.out.println("Fail: o carro nao pode sair na marcha neutra");
        }
    }

    public void trocarMarcha(int trocaMarcha) {
        if (!getLigado()) {
            System.out.println("Fail: O Carro precisa ser ligado antes");
            return;
        }

        if (trocaMarcha == 1) {
            if (marcha < 6) {
                if (velocidade == 0 || velocidade == 20 || velocidade == 40 || velocidade == 60 || velocidade == 80 || velocidade == 100) {
                    marcha++;
                } else {
                    System.out.println("Fail: troca de marcha incompativel com velocidade");
                }
            } else {
                System.out.println("Fail: ja esta na ultima marcha");
            }
        }

        else if (trocaMarcha == -1) {
            if ((marcha == 1 && velocidade == 0) || (marcha == 2 && velocidade <= 20) || (marcha == 3 && velocidade <= 40) || (marcha == 4 && velocidade <= 60) || (marcha == 5 && velocidade <= 80) || (marcha == 6 && velocidade <= 100)) {
                marcha--;
            } else {
                System.out.println("Fail: troca de marcha incompativel com velocidade");
            }
        } else {
            System.out.println("Fail: comando invalido");
        }
    }


    public void virar(int diresao) {
        if(getLigado()) {
            if(velocidade >= 1 && velocidade <= 40) {
                if(diresao == 1) {
                    System.out.println("voce virou para a esquerda");
                } else if(diresao == 2) {
                    System.out.println("voce virou para a direita");
                } else {
                    System.out.println("Fail: direcao invalida");
                }
            } else {
                System.out.println("Fail: velocidade acima do limite para virar");
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }
}