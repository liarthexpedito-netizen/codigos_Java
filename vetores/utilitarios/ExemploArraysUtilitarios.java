package vetores.utilitarios;

import java.util.Arrays; // Importa a classe Arrays necessária

public class ExemploArraysUtilitarios {
    public static void main(String[] args) {
        // Cria e inicializa um vetor com números desordenados
        int[] numeros = {8, 3, 10, 1, 5};

        // 1. Arrays.toString(): Mostra o conteúdo do array de forma legível
        System.out.println("Array original: " + Arrays.toString(numeros));

        // 2. Arrays.sort(): Ordena o array em ordem crescente
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        // 3. Arrays.binarySearch(): Busca um valor (ex: o número 10)
        // Nota: O array precisa estar ordenado para a busca binária funcionar corretamente!
        int pos = Arrays.binarySearch(numeros, 10);
        System.out.println("O número 10 está no índice: " + pos);

        // 4. Arrays.fill(): Preenche todo o array com um valor específico (ex: o número 0)
        Arrays.fill(numeros, 0);
        System.out.println("Array após o preenchimento com zeros: " + Arrays.toString(numeros));
    }
}