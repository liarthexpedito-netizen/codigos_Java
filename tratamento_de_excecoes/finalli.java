package tratamento_de_excecoes;

import java.io.File; //Importa a classe File, usada para representar o caminho de um arquivo ou diretório no sistema operacional.
import java.io.IOException;
import java.util.Scanner;

public class finalli {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\Expedito\\Downloads\\Curso de Java\\in.txt"); //Cria um objeto file apontando para o caminho C:\temp\in.txt
        Scanner vazio = null; //Declara a variável vazio do tipo Scanner e a inicializa com null (vazia por enquanto). Ela é declarada fora do bloco try para que também possa ser acessada dentro do bloco finally.

        try {
            vazio = new Scanner(arquivo); //Instancia o Scanner associado ao file, preparando a leitura do arquivo. Se o arquivo não existir ou não puder ser acessado, uma exceção (como FileNotFoundException, que é uma subclasse de IOException) pode ser lançada.
            while (vazio.hasNextLine()) { //Inicia um laço de repetição while. O método hasNextLine() verifica se ainda existe uma próxima linha não lida no arquivo; enquanto retornar true, o laço continua.
                System.out.println(vazio.nextLine()); //System.out.println(sc.nextLine());sc.nextLine() lê a próxima linha completa do arquivo e avança o cursor para a seguinte; System.out.println(...) imprime essa linha no console seguida de uma quebra de linha.
            }
        }

        catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
        finally { //Inicia um bloco que sempre será executado ao final do try/catch, tenha ocorrido erro ou não. É o local ideal para liberar recursos.
            if (vazio != null) { //Verifica se sc chegou a ser inicializado (ou seja, se não é null), evitando um NullPointerException caso a criação do Scanner tenha falhado antes de atribuir o objeto.
                vazio.close(); //Fecha o Scanner, liberando o fluxo de leitura e os recursos do sistema operacional associados ao arquivo.
                System.out.println("Bloco finally executado");
            }
        }
    }
}


