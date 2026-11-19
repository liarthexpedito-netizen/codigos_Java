package heranca_polimorfismo.exercicio_dois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto_usado extends Produto {

    private LocalDate data_de_fabricacao;

    public Produto_usado() {super();}

    public Produto_usado(String nome, Double preco, LocalDate data_de_fabricacao) {
        super(nome, preco);
        this.data_de_fabricacao = data_de_fabricacao;
    }

    public LocalDate getData_de_fabricacao() {
        return data_de_fabricacao;
    }

    public void setData_de_fabricacao(LocalDate data_de_fabricacao) {
        this.data_de_fabricacao = data_de_fabricacao;
    }

    @Override 
     public String Precotag() {
        return getNome() + " (usado) R$" + String.format("%.2f", getPreco()) + " (Data de fabricação: " + data_de_fabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyy")) + ")";
    }
    
}
