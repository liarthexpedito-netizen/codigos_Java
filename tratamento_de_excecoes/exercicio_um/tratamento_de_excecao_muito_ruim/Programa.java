package tratamento_de_excecoes.exercicio_um.tratamento_de_excecao_muito_ruim;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Solução 1 (muito ruim): lógica de validação no programa principal.

        System.out.print("Número do quarto: ");
        int numero_do_quarto = sc.nextInt();
        System.out.print("Dia de entrada no hotel: ");
        Date dia_de_entrada = formato.parse(sc.next());
        System.out.print("Dia de saída no hotel: ");
        Date dia_de_saida = formato.parse(sc.next());

        // 'after' calcular se uma data e depois de outra
        if (!dia_de_saida.after(dia_de_entrada)) {
            System.out.println("Erro na reserva: As datas da reserva para atualização devem ser datas futuras");
        } else {
            Reserva reserva = new Reserva(numero_do_quarto, dia_de_entrada, dia_de_saida);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Digite os dados para atualizar a reserva");
            System.out.print("Dia de entrada no hotel: ");
            dia_de_entrada = formato.parse(sc.next());
            System.out.print("Dia de saída no hotel: ");
            dia_de_saida = formato.parse(sc.next());

            Date agora = new Date(); // Cria uma data com o horário de agora
            if (dia_de_entrada.before(agora) || dia_de_saida.before(agora)) {
                System.out.println("Erro na reserva: As datas da reserva para atualização devem ser datas futuras");
            } else if (!dia_de_saida.after(dia_de_entrada)) {
                System.out.println("Erro na reserva: As datas da reserva para atualização devem ser datas futuras");
            } else {
                reserva.AtualizarData(dia_de_entrada, dia_de_saida);
                System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();
    }
}
