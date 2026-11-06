package data_hora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Operacoes_com_data_hora_dois {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = Date.from(Instant.parse("2026-11-25T10:30:00Z"));

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(data);
        calendario.add(Calendar.HOUR_OF_DAY, 10);
        data = calendario.getTime();

        Calendar calendario2 = Calendar.getInstance();
        calendario2.setTime(data);
        int minutos = calendario2.get(Calendar.MINUTE);
        int mes = 1 + calendario2.get(Calendar.MONTH);


        System.out.println(data);
        System.out.println(sdf.format(data));
        System.out.println("Minutos = " + minutos);
        System.out.println("Mês = " + mes);

    }
}
