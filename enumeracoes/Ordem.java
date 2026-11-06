package enumeracoes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ordem {

    private Integer id;
    private LocalDateTime momento;
    private Status ordem;
    
    public Ordem() {}

    public Ordem(Integer id, LocalDateTime momento, Status ordem) {
        this.id = id;
        this.momento = momento;
        this.ordem = ordem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Status getOrdem() {
        return ordem;
    }

    public void setOrdem(Status ordem) {
        this.ordem = ordem;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Ordem [id = " + id + ", momento = " + momento.format(fmt) + ", ordem = " + ordem + "]";
    }

}
