package enumExample;

public enum Dias implements VerificaFimDeSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;

    @Override
    public boolean eFimDeSemana() {
        return this == SABADO || this == DOMINGO;
    }
}
