package Programação_Orientada_a_Objetos.Introdução_Herança_e_Polimorfismo.Herança_Polimorfismo.Exercicio3;

public non-sealed class  USRelogio extends Relogio {
    private String periodoIndicado;

    public String getPeriodoIndicado() {
        return periodoIndicado;
    }

    public void setAfterMidday() {
        this.periodoIndicado = "PM";
    }

    public void setBeforMidday() {
        this.periodoIndicado = "AM";
    }

    @Override
    public void setHora(int hora) {
        setBeforMidday();

        if ((hora > 12) && (hora <= 23)) {
            setAfterMidday();
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        } else {
            this.hora = hora;
        }
    }

    @Override
    public Relogio convert(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();

        switch (relogio) {
            case USRelogio usRelogio ->{
                this.hora = usRelogio.getHora();
                this.periodoIndicado = usRelogio.getPeriodoIndicado();
            }
            case BRLRelogio brlRelogio -> this.setHora(brlRelogio.getHora());
        }
        return this;
    }

    @Override
    public String getTempo() {
        return super.getTempo() + " " + this.periodoIndicado;
    }
}
