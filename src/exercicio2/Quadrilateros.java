package exercicio2;

import java.util.Scanner;

public class Quadrilateros {
	String quadrilateroTipo;
	int area;
	
	public Quadrilateros() {}
	
	public int area(int lado) {
		this.area = lado * lado;
		return this.area;
	}
	
	public int area(int base, int altura) {
		this.area = base * altura;
		return this.area;
	}
	
	public int area(int baseMaior, int baseMenor, int altura) {
		this.area = (baseMaior + baseMenor) * altura / 2;
		return this.area;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha o tipo de quadrilátero:");
		System.out.println("[1] Quadrado \n[2] Retângulo \n[3] Trapézio");
		int tipo = ler.nextInt();
		if (tipo == 1) {
			Quadrilateros quadrado = new Quadrilateros();
			quadrado.quadrilateroTipo = "quadrado";
			System.out.println("Lado do quadrado:");
			int lado = ler.nextInt();
			System.out.println("Área = " + quadrado.area(lado));
		}
		if (tipo == 2) {
			Quadrilateros retangulo = new Quadrilateros();
			retangulo.quadrilateroTipo = "retângulo";
			System.out.println("Base do retângulo:");
			int base = ler.nextInt();
			System.out.println("Altura do retângulo:");
			int altura = ler.nextInt();
			System.out.println("Área = " + retangulo.area(base, altura));
		}
		if (tipo == 3) {
			Quadrilateros trapezio = new Quadrilateros();
			trapezio.quadrilateroTipo = "trapézio";
			System.out.println("Base maior:");
			int baseMaior = ler.nextInt();
			System.out.println("Base menor:");
			int baseMenor = ler.nextInt();
			System.out.println("Altura:");
			int altura = ler.nextInt();
			System.out.println("Área = " + trapezio.area(baseMaior, baseMenor, altura));
		}
	}
	
	
}
