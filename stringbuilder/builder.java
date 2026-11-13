package stringbuilder;

public class builder {
    public static void main(String[] args) {

        /*
        O StringBuilder serve para criar e manipular textos (strings) de forma mutável e com alto desempenho,
        evitando o desperdício de memória causado pela imutabilidade das strings comuns.
        */

    //Objeto StringBuilder com a capacidade padrão de 16 caracteres
    StringBuilder string1 = new StringBuilder();
    //Objeto StringBuilder com 50 caracteres
    StringBuilder string2 = new StringBuilder(50);
    //Obejto StringBuilder com capacidade do tamanho da string repassada + 16 caracteres
    StringBuilder string3 = new StringBuilder("Aprendendo Java");
    StringBuilder string4 = new StringBuilder("Aprendendo StringBuilder");
    
    System.out.printf("String1 = %s %n", string1);
    System.out.printf("String2 = %s %n", string2);
    System.out.printf("String3 = %s %n", string3);
    string1.append(string3);
    System.out.printf("String4 = %s%n", string4.toString());
    System.out.printf("Capacidade = %d%n", string4.capacity());
    System.out.printf("Comprimento = %d%n", string4.length());
    string4.setLength(15);
    System.out.printf("Novo comprimento = %d%n", string4.length());
    System.out.printf("String4 = %s%n", string4.toString());
     
    }
    
}
