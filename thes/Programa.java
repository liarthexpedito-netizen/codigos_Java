package thes;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa);

        sc.close();
    }
}
