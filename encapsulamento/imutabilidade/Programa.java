package encapsulamento.imutabilidade;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();

        Pessoa p = new Pessoa(nome, idade);

        System.out.println();

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        sc.close();
    }
}
