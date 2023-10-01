package school.sptech.projeto02;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroi {

    private String nomeVerdadeiro;
    private String nomeHeroi;
    private Double forca;
    private Boolean voa;

    public SuperHeroi(String nomeVerdadeiro, String nomeHeroi, Double forca, Boolean voa) {
        this.nomeVerdadeiro = nomeVerdadeiro;
        this.nomeHeroi = nomeHeroi;
        this.forca = forca;
        this.voa = voa;
    }

    public SuperHeroi(){}

    public String getNomeVerdadeiro() {
        return nomeVerdadeiro;
    }

    public void setNomeVerdadeiro(String nomeVerdadeiro) {
        this.nomeVerdadeiro = nomeVerdadeiro;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Boolean getVoa() {
        return voa;
    }

    public void setVoa(Boolean voa) {
        this.voa = voa;
    }

    public String getCategoria() {
        return forca < 1000 ? "Fraco" : "Forte";
    }
}
