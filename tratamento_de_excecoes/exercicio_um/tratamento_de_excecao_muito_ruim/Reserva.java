package tratamento_de_excecoes.exercicio_um.tratamento_de_excecao_muito_ruim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numero_do_quarto;
    private Date dia_de_entrada;
    private Date dia_de_saida;

    private static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");

    public Reserva() {}

    public Reserva(Integer numero_do_quarto, Date dia_de_entrada, Date dia_de_saida) {
        this.numero_do_quarto = numero_do_quarto;
        this.dia_de_entrada = dia_de_entrada;
        this.dia_de_saida = dia_de_saida;
    }

    public Integer getNumero_do_quarto() {
        return numero_do_quarto;
    }

    public void setNumero_do_quarto(Integer numero_do_quarto) {
        this.numero_do_quarto = numero_do_quarto;
    }

    public Date getDia_de_entrada() {
        return dia_de_entrada;
    }

    public Date getDia_de_saida() {
        return dia_de_saida;
    }

    public long Duracao() {
        long duracao = dia_de_saida.getTime() - dia_de_entrada.getTime(); //.getTime() transforma em MILISEGUNDOS
        return TimeUnit.DAYS.convert(duracao, TimeUnit.MILLISECONDS); //Transforma os MILISEGUNDOS em DIAS
    }

    public void AtualizarData(Date dia_de_entrada, Date dia_de_saida) {
        this.dia_de_entrada = dia_de_entrada;
        this.dia_de_saida = dia_de_saida;
    }

    @Override 
    public String toString() {
        return "Número do quarto " 
        + numero_do_quarto 
        + ", dia de entrada no hotel: " 
        + formato.format(dia_de_entrada) 
        + ", dia de saída do hotel: " + formato.format(dia_de_saida) 
        + ", " 
        + Duracao() 
        + " noites";
    }

}
