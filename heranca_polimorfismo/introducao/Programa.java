package heranca_polimorfismo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        
        //Objeto do tipo 'Pai' que recebe uma instaciação do tipo 'Pai'
        Pai papai = new Pai();
        //Objeto do tipi 'Filho' que recebe uma instaciação do tipo 'Filho'
        Filho filinho = new Filho();
        //Objeto do tipo 'Pai' que recebe uma instaciação do tipo 'Filho' e 'FilhoCacula'
        Pai p = new Filho();
        Pai father = new FilhoCacula();

        System.out.println("Ponto forte do pai: ");
        papai.PontoForte();
        System.out.println("Ponto forte do filho: ");
        filinho.PontoForte();
        System.out.println("Conceito de dispatch dinâmico: ");
        p.PontoForte();
        father.PontoForte();

        // Criando uma lista da superclasse Pai que vai armazenar diferentes filhos (Polimorfismo em Coleções)
        List<Pai> familia = new ArrayList<>();
        
        familia.add(new Pai());
        familia.add(new Filho());
        familia.add(new FilhoCacula());

        System.out.println("=== Percorrendo a lista da familia (Dispatch Dinâmico em ação) ===");
        
        // O loop percorre cada elemento chamando o método. O Java descobre o tipo real em tempo de execução
        for (Pai membro : familia) {
            membro.PontoForte();
            System.out.println("-------------------");
        }

    }
}
