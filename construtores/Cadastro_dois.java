package construtores;

import java.util.Scanner;

public class Cadastro_dois {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Como o objeto só inicializa depois, então não colocamos: Nome_do_objeto.atributo

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("email: ");
        String email = sc.nextLine();
        System.out.print("idade: ");
        int idade = sc.nextInt();

        //Agora  o objeto obrigatoriamente inicializa já com dados

        Logica_de_cadastro entrada = new Logica_de_cadastro(nome, email, idade); //Passando os dados para o objeto

        System.out.println(entrada);

        sc.close();
    }
}
