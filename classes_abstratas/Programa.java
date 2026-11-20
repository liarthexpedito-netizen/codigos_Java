package classes_abstratas;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       //Animal animal = new Animal(); --> Devido ao abstract não é possível criar objetos instaciados por Animal().
       //Mas e possível instaciarmos objetos com subclasses de superclasses abstratas.

        Animal felino = new Tigre();

        System.out.print("Digite o nome do animal: ");
        felino.nome = sc.nextLine();

        felino.Dormir();
        ((Tigre) felino).Estado();

        sc.close();
    }
}
