package exercicio1;

import java.util.Scanner;

public class Emprestimo {
	double valorInicial;
	double valorFinal;
	double taxaJuros;
	int periodoAplicacao;
	
	public Emprestimo(double valorInicial, double taxaJuros, int periodoAplicacao) {
		this.valorInicial = valorInicial;
		this.taxaJuros = taxaJuros;
		this.periodoAplicacao = periodoAplicacao;
	}
	
	public double montante() {
		double m = valorInicial * Math.pow((1 + taxaJuros),periodoAplicacao);
		this.valorFinal = m;
		return this.valorFinal;
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Capital solicitado:");
		double ci = ler.nextDouble();
		System.out.println("Taxa mensal aplicada:");
		double tm = ler.nextDouble();
		System.out.println("Período em meses até a  quitação:");
		int pm = ler.nextInt();
		Emprestimo emprestimo = new Emprestimo(ci,tm,pm);
		emprestimo.montante();
		System.out.print("O valor final restituído foi de ");
		System.out.println("R$" + emprestimo.valorFinal);
	}
	
}
