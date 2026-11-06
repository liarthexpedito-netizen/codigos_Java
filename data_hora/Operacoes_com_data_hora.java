package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Operacoes_com_data_hora {
    public static void main(String[] args) {
        
        LocalDate d01 = LocalDate.parse("2026-08-14");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-14T01:30:26");
        Instant d03 = Instant.parse("2026-08-14T00:00:00Z");

        LocalDate op1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate op2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime op3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime op4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        //Somando e subtraindo dias, meses e anos
        LocalDate menos_dias = d01.minusDays(10);
        LocalDate mais_dias = d01.plusDays(10);
        LocalDate mais_anos = d01.plusYears(10);
        LocalDateTime menos_dias_hora = d02.minusDays(10);
        LocalDateTime mais_dias_horas = d02.plusDays(10);
        LocalDate ano = d01.withYear(2030);
        Period periodo = Period.ofDays(15);
        Duration duracao = Duration.ofHours(3);

        Instant global1 = d03.minus(10, ChronoUnit.DAYS);
        Instant global2 = d03.plus(10, ChronoUnit.DAYS);

        Duration t1 = Duration.between(menos_dias_hora, d02);
        Duration t2 = Duration.between(menos_dias.atTime(0, 0), d01.atTime(0, 0));
        Duration t3 = Duration.between(menos_dias.atStartOfDay(), d01.atStartOfDay());
        Duration t4 = Duration.between(global1, d03);
        Duration t5 = Duration.between(d03, global1);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
        System.out.println(menos_dias);
        System.out.println(mais_dias);
        System.out.println(mais_anos);
        System.out.println(menos_dias_hora);
        System.out.println(mais_dias_horas);
        System.out.println(ano);
        System.out.println(periodo);
        System.out.println(duracao);
        System.out.println(global1);
        System.out.println(global2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);

        System.out.println("=============================");

        System.out.println("Mês = " + d01.getDayOfMonth()); //Obter dia do mês
        System.out.println("Valor do mês = " + d01.getMonthValue()); //Obter o valor do mês
        System.out.println("Ano = " + d01.getYear()); //Obter o ano
        System.out.println("Horas = " + d02.getHour()); //Obter as horas
        System.out.println("Minutos = " + d02.getMinute()); //Obter os minutos
        System.out.println("Segundos = " + d02.getSecond()); //Obter os segundos
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
        System.out.println(t5.toDays());
    

    }
}
