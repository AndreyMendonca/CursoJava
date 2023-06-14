package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		
		//DATA - DATA/HORA - DATA/HORA COM TIMEZONE(Z) NO MOMENTO EXATO
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//CONVERSÃO DE TEXTO PARA HORA
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		//CRIAR PADRÃO PARA TEXTO
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d06 = LocalDate.parse("10/10/2000", fmt1);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d07 = LocalDate.parse("10/10/2000 10:10", fmt2);
		
		//CONVERTENDO HORAS PARA TEXTO/IMPRESSOES 
		LocalDate d08 = LocalDate.parse("2022-07-20");
		LocalDateTime d09 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d10 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt08 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt09 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt10 = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("D08 " + d08.format(fmt08));
		System.out.println("D09 " + fmt09.format(d09));
		System.out.println("D10 " + fmt10.format(d10));
		
		
		
	}
}
