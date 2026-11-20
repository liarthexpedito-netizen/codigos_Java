package classes_abstratas;

public abstract class Animal {

    //'Abstract' e o oposto do 'final'
    
    protected String nome;

    public Animal() {};

    public Animal(String nome) {
        this.nome = nome;
    }

    public void Dormir() {
        System.out.println(this.nome + " está dormindo");
    }

}
