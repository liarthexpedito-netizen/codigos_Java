package laco_for_each;

public class Exemplo {
    public static void main(String[] args) {
        
        int[] vetor = new int[5];

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        for (int numero : vetor) {
            System.out.println(numero);
        }
        
    }
}
