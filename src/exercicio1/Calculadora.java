package exercicio1;

import java.util.Scanner;

class Calculadora {
	
	public Calculadora() {}
	
	public double soma(double a, double b) {
		double soma = a + b;
		return soma;
	}
	public double subtracao(double a, double b) {
		double subtracao = a - b;
		return subtracao;
	}
	public double produto(double a, double b) {
		double produto = a * b;
		return produto;
	}
	public double divisao(double a, double b) {
		double divisao = a / b;
		return divisao;
	}
	
	public static void main(String[] args) {
		Calculadora operacao = new Calculadora();
		Scanner ler = new Scanner(System.in);
		System.out.println("Valor de a:");
		double a = ler.nextDouble();
		System.out.println("Valor de b:");
		double b = ler.nextDouble();
		System.out.println("Escolha uma operação:");
		System.out.println("[ 1 ] Soma");
		System.out.println("[ 2 ] Subtração");
		System.out.println("[ 3 ] Produto");
		System.out.println("[ 4 ] Divisão");
		int escolha = ler.nextInt();
		if (escolha == 1) {
			System.out.println(a + " + " + b + " = " + operacao.soma(a, b));
		}
		if (escolha == 2) {
			System.out.println(a + " - " + b + " = " + operacao.subtracao(a, b));
		}
		if (escolha == 3) {
			System.out.println(a + " x " + b + " = " + operacao.produto(a, b));
		}
		if (escolha == 4) {
			System.out.println(a + "/" + b + " = " + operacao.divisao(a, b));
		}
	}
	
}
