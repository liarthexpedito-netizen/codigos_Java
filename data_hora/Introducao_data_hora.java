package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Introducao_data_hora {
    public static void main(String[] args) {
        
        //Data-hora local
        LocalDate d01 = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime d02 = LocalDateTime.now();

        //Data-hora global (com fuso horário)
        Instant d03 = Instant.now();
        Instant d04 = Instant.parse("2026-01-01T10:30:00Z");
        Instant d05 = Instant.parse("2026-01-01T10:30:00-03:00");
        ZonedDateTime zdt = ZonedDateTime.now();
        
        //Forma de escrita no padrão ISO 8601 -> Data-hora
        LocalDate d06 = LocalDate.parse("2004-08-26");
        LocalDateTime d07 = LocalDateTime.parse("2004-08-26T11:00:00");

        //Texto customizado -> Data-hora
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("03/11/2026", formato1);

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("03/11/2026 15:00", formato2);

        //Instanciação
        LocalDate d10 = LocalDate.of(2026, 11, 3);
        LocalDateTime d11 = LocalDateTime.of(2026, 11, 3, 17, 30);

        System.out.println(d01);
        System.out.println(hora);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(zdt);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        //Formatação: Data-hora -> Texto formatado customizado
        System.out.println(d06.format(formato1));
        System.out.println(formato1.format(d06));
        System.out.println(d06.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(d07.format(formato1));
        System.out.println(d07.format(formato2));
        //Formatação para Data-hora global torna-se diferente
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println(formato3.format(d04));
        DateTimeFormatter formato4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(d07.format(formato4));
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(formato5.format(d04));


    }
}
