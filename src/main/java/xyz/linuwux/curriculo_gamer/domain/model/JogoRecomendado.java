package xyz.linuwux.curriculo_gamer.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_recomendados")
public class JogoRecomendado extends Jogo{
    private int compatibilidade;


    public int getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(int compatibilidade) {
        this.compatibilidade = compatibilidade;
    }
}
