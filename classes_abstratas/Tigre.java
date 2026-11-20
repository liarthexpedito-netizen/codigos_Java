package classes_abstratas;

public class Tigre extends Animal {
    
    private String vontade;

    public Tigre() {super();}

    public Tigre(String nome, String vontade) {
        super(nome);
        this.vontade = vontade;
    }

    public String getVontade() {
        return vontade;
    }

    public void setVontade(String vontade) {
        this.vontade = vontade;
    }

    public void Estado() {
        System.out.println(this.nome + " está com fome");
    }

}
