import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Classe principal responsavel por demonstrar a leitura e formatacao
 * de datas utilizando LocalDate e DateTimeFormatter em Java.
 */
public class Sintaxe_data_hora {

    public static void main(String[] args) {
        // 1. Inicializa o Scanner para capturar a entrada do usuario pelo console
        Scanner sc = new Scanner(System.in);

        // 2. Define o padrao de data esperado (dia/mes/ano com 4 digitos)
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // 3. Solicita e le a data como texto (String)
        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String dataTexto = sc.nextLine();

        // 4. Converte o texto lido para o tipo LocalDate usando o formato definido
        LocalDate d08 = LocalDate.parse(dataTexto, formato1);

        // 5. Exibe a data convertida (formato padrao ISO: aaaa-MM-dd) e formatada novamente
        System.out.println("LocalDate (padrao ISO): " + d08);
        System.out.println("Data formatada: " + d08.format(formato1));

        // 6. Fecha o Scanner para liberar recursos do sistema
        sc.close();
    }
}
