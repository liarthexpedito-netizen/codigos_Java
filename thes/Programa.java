package thes;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        Pessoa pessoa_dois = new Pessoa();

        System.out.println(pessoa);
        System.out.println(pessoa_dois);

        sc.close();
    }
}
