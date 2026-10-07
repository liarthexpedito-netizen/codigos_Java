package membros_estaticos;

import java.util.Scanner;

public class Constante {

    public static final int SENHA = 12345;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int entrada = sc.nextInt();

        if (entrada == SENHA) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }

        sc.close();
    }
}
