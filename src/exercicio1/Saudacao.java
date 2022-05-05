package exercicio1;

import java.util.GregorianCalendar;

public class Saudacao {
	
	public Saudacao() {}
	
	public void bomDia() {
		System.out.println("Bom dia!");
	}
	
	public void boaTarde() {
		System.out.println("Boa tarde!");
	}
	
	public void boaNoite() {
		 System.out.println("Boa noite!");
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
		System.out.println(agora);
	}

}
