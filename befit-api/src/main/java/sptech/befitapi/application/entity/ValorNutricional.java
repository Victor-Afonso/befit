package sptech.befitapi.application.entity;

public class ValorNutricional {

    private String nome;

    private Double proteina;

    private Double lipidio;

    private Double carboidrato;

    private Double sodio;

    private Double caloria;

    private Double quantidade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getProteina() {
        return proteina;
    }

    public void setProteina(Double proteina) {
        this.proteina = proteina;
    }

    public Double getLipidio() {
        return lipidio;
    }

    public void setLipidio(Double lipidio) {
        this.lipidio = lipidio;
    }

    public Double getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(Double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public Double getSodio() {
        return sodio;
    }

    public void setSodio(Double sodio) {
        this.sodio = sodio;
    }

    public Double getCaloria() {
        return caloria;
    }

    public void setCaloria(Double caloria) {
        this.caloria = caloria;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
