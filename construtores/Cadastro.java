package construtores;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Logica_de_cadastro entrada = new Logica_de_cadastro();

        //Após ter criado o objeto na linha 10, ele inicia seus atributos vazios.
        System.out.println(entrada.nome);
        System.out.println(entrada.email);
        System.out.println(entrada.idade);

        entrada.nome = sc.nextLine();
        entrada.email = sc.nextLine();
        entrada.idade = sc.nextInt();

        System.out.println(entrada);

        sc.close();
    }
}
