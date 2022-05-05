package exercicio1;

import java.util.GregorianCalendar;

public class Saudacao {
	
	public Saudacao() {}
	
	public String bomDia() {
		return "Bom dia!";
	}
	
	public String boaTarde() {
		return "Boa tarde!";
	}
	
	public String boaNoite() {
		return "Boa noite!";
	}
	
	public static void main(String[] args) {
		int agora = GregorianCalendar.HOUR_OF_DAY;
		Saudacao saudacao = new Saudacao();
		if (agora >= 5 && agora < 12) {
			saudacao.bomDia();
		}
		if (agora >= 12 && agora < 18) {
			saudacao.boaTarde();
		}
		if (agora >= 18 && agora <= 23) {
			saudacao.boaNoite();
		}
	}

}
