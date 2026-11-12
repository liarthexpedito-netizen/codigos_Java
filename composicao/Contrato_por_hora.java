package composicao;

import java.time.LocalDate;

public class Contrato_por_hora {

    private LocalDate data;
    private Double valor_por_hora_trabalhada;
    private Integer horas;

    public Contrato_por_hora() {}

    public Contrato_por_hora(LocalDate data, Double valor_por_hora_trabalhada, Integer horas) {
        this.data = data;
        this.valor_por_hora_trabalhada = valor_por_hora_trabalhada;
        this.horas = horas;
    }

    public double valor_Total() {
        return valor_por_hora_trabalhada * horas;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public Double getValor_por_hora_trabalhada() {
        return valor_por_hora_trabalhada;
    }
    public void setValor_por_hora_trabalhada(Double valor_por_hora_trabalhada) {
        this.valor_por_hora_trabalhada = valor_por_hora_trabalhada;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valor_total() {
        return valor_por_hora_trabalhada * horas;
    }

}