package sptech.befitapi.application.response;

public class ValorNutricionalResponse {

    private Double proteina;

    private Double lipidio;

    private Double carboidrato;

    private Double sodio;

    private Double caloria;

    public ValorNutricionalResponse(Double proteina, Double lipidio, Double carboidrato, Double sodio, Double caloria) {
        this.proteina = proteina;
        this.lipidio = lipidio;
        this.carboidrato = carboidrato;
        this.sodio = sodio;
        this.caloria = caloria;
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
}
