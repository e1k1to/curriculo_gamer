package xyz.linuwux.curriculo_gamer.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "tb_jogados")
public class JogoJogado extends Jogo{
    @Column(length = 32)
    private String status;
    private int nota;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
