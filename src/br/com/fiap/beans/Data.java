package br.com.fiap.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public String data() {
		LocalDateTime agora = LocalDateTime.now();
		
		// Formata a data e hora
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String dataFormatada = agora.format(formatadorData);
		String horaFormatada = agora.format(formatadorHora);
		
		return dataFormatada + " " + horaFormatada;
	}
}
