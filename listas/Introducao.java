package listas;

import java.util.ArrayList; //Estrutura que pssui métodos prontos: add, remove, seze, etc.
import java.util.List; //Importa a interface list.
import java.util.stream.Collectors;

public class Introducao {
    public static void main(String[] args) {
        
        //Inicializando uma lista
        List <String> lista = new ArrayList<>();

        //Adicionando elemento a lista
        lista.add("Expedito");
        lista.add("Bruno");
        lista.add("Cristina");
        //Adicionando elemento no índice 2
        lista.add(2, "Gabriel");
        //Tamanho da lista
        System.out.println(lista.size());
        //Removendo elemento
        lista.remove("Expedito");
        //Removendo elemento pelo índice
        lista.remove(1);

        for (String nome : lista) {
            System.out.println(nome);
        }

        System.out.println("-------------------------------");

        //'x' representa cada elemento da lista
        // '->' lambda operator
        //Remover os elementos que satisfazem determinada condição
        lista.removeIf(x -> x.charAt(0) == 'B');
        for (String x : lista) {
            System.out.println(x);
        }
        //Buscando o índice
        System.out.println("-------------------------------");

        System.out.println("Índice da Cristina: " + lista.indexOf("Cristina"));

        System.out.println("-------------------------------");

        List <String> resultado = lista.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        String nome = lista.stream().filter(x-> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(nome);

        }

    }

// ==========================================
// RESUMO RÁPIDO: JAVA STREAM API
// ==========================================

// 1. .stream()
// Converte uma coleção (List, Set, etc.) em um fluxo de dados 
// para permitir operações funcionais, sem alterar a lista original.

// 2. .collect(Collectors.toList())
// Operação terminal que pega os elementos filtrados/modificados 
// do Stream e os empacota de volta em uma nova List padrão.

// 3. .findFirst()
// Operação terminal que retorna o PRIMEIRO elemento que passou 
// pelo filtro. Retorna um Optional e para de buscar assim que acha.

// 4. .orElse(valor)
// Método do Optional usado para segurança. Se a busca (como findFirst) 
// não encontrar nada, ele retorna o valor padrão especificado (ex: null).

