package Programação_Orientada_a_Obijetos.Abstração_com_Classes_e_Encapsulamento.Exercisio2;

public class Carro {
    private boolean ligado;
    private int marcha;
    private  int velocidade;

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

    public void velocidade(int valor) { // variavel magica presisa esta de acordo com as regas de neogcios
        if(getLigado()) {
            switch(marcha) {
                case 1:
                    if(velocidade >= 0 && velocidade <= 20) {
                        if(valor == 3){
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                case 2:
                    if(velocidade >= 20 && velocidade <= 40) {
                        if(valor == 3) {
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                case 3:
                    if(velocidade >= 40 && velocidade <= 60) {
                        if(valor == 3) {
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                case 4:
                    if(velocidade >= 60 && velocidade <= 80) {
                        if(valor == 3) {
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                case 5:
                     if (velocidade >= 80 && velocidade <= 100) {
                        if(valor == 3) {
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                case 6:
                    if(velocidade >= 100 && velocidade <= 120) {
                        if(valor == 3) {
                            velocidade ++;
                        } else {
                            velocidade --;
                        }
                    } else {
                        System.out.println("Fail: limite de velocidade atinjido");
                    }
                    break;

                default:
                    System.out.println("Fail: o carro nao pode sair na marcha neutra");
                    break;
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }

    public void trocarMarcha(int trocaMarcha) { // variavel magica presisa esta de acordo com as regas de neogcios
        if(getLigado()) {
            if(trocaMarcha == 1) {
                if(marcha == 0 || (marcha > 0 && marcha < 6)) {
                    if(velocidade == 0) {
                        marcha ++;

                    } else if(velocidade == 20 || velocidade == 40 || velocidade == 60 || velocidade == 80 || velocidade == 100) {
                        marcha ++;

                    }else {
                        System.out.println("Fail: troca de marcha incompativel com velocidade");
                    }
                } else if(marcha == 6){

                    System.out.println("Fail ja esta na ultima marcha");
                } else {
                    System.out.println("Fail: marcha incapas de ser modifcada");
                }
            } else {
                if(velocidade == 101 || velocidade == 81 || velocidade == 41 || velocidade == 21) {
                    marcha --;
                } else if(marcha == 0) {
                    System.out.println("Fail: voce ja esta no neutro");
                }else {
                    System.out.println("Fail: troca de marcha incompativel com velocidade");
                }
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }

    public void virar(int diresao) {
        if(getLigado()) {
            if(velocidade >= 1 && velocidade <= 40) {
                if(diresao == 5) {
                    System.out.println("voce virou para a esquerda");
                } else {
                    System.out.println("voce virou para a direita");
                }
            } else {
                System.out.println("Fail: velocidade acima do limite para virar");
            }
        } else {
            System.out.println("Fail: O Carro presisa ser ligado antes");
        }
    }
}