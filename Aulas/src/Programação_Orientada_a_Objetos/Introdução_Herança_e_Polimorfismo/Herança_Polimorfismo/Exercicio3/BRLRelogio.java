package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio3;

public non-sealed class BRLRelogio extends Relogio  {

    @Override
    public Relogio convert(final Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();
        switch (relogio) {
            case USRelogio usRelogio -> this.hora = (usRelogio.getPeriodoIndicado().equals("PM")) ? usRelogio.getHora() + 12 : usRelogio.getHora();

            case BRLRelogio brlRelogio -> this.hora = brlRelogio.getHora();
        }
        return this;
    }
}
