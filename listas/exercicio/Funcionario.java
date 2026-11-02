package listas.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Folha_salarial> lista = new ArrayList<>();

        System.out.print("Digite quantos funcionários deseja cadastra: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();

            while (Verificacao(lista, id)) {
                System.out.print("Este Id já foi utilizado, tente outro: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            lista.add(new Folha_salarial(id, nome, salario));
        }

        System.out.println();
        System.out.print("Insira o ID do funcionário que receberá um aumento salarial: ");
		int id = sc.nextInt();

        Folha_salarial emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Esse Id não existe!");
        } else {
            System.out.print("Enter com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            emp.Aumento_salarial(porcentagem);

            System.out.println();
            System.out.println("Lista dos funcionários: ");
            for (Folha_salarial obj : lista) {
                System.out.println(obj);
            }
        }

        sc.close();
    }

    //Verificar se determinado 'Id' já existe dentro de uma lista de funcionários
    //Retornando true se já existir e false caso contrário.
    //Usamos o tipo boolean, pois a função irá retorna verdadeiro(1) ou falso(0)
    public static boolean Verificacao(List<Folha_salarial> lista, int id) {
        Folha_salarial emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
   
}
