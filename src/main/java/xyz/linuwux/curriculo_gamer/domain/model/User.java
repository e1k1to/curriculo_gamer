package xyz.linuwux.curriculo_gamer.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JogoJogado> jogosJogados;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<JogoRecomendado> jogosRecomendados;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JogoJogado> getJogosJogados() {
        return jogosJogados;
    }

    public void setJogosJogados(List<JogoJogado> jogosJogados) {
        this.jogosJogados = jogosJogados;
    }

    public List<JogoRecomendado> getJogosRecomendados() {
        return jogosRecomendados;
    }

    public void setJogosRecomendados(List<JogoRecomendado> jogosRecomendados) {
        this.jogosRecomendados = jogosRecomendados;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
