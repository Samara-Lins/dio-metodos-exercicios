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
		System.out.println("Escolha o tipo de quadril�tero:");
		System.out.println("[1] Quadrado \n[2] Ret�ngulo \n[3] Trap�zio");
		int tipo = ler.nextInt();
		if (tipo == 1) {
			Quadrilateros quadrado = new Quadrilateros();
			quadrado.quadrilateroTipo = "quadrado";
			System.out.println("Lado do quadrado:");
			int lado = ler.nextInt();
			System.out.println("�rea = " + quadrado.area(lado));
		}
		if (tipo == 2) {
			Quadrilateros retangulo = new Quadrilateros();
			retangulo.quadrilateroTipo = "ret�ngulo";
			System.out.println("Base do ret�ngulo:");
			int base = ler.nextInt();
			System.out.println("Altura do ret�ngulo:");
			int altura = ler.nextInt();
			System.out.println("�rea = " + retangulo.area(base, altura));
		}
		if (tipo == 3) {
			Quadrilateros trapezio = new Quadrilateros();
			trapezio.quadrilateroTipo = "trap�zio";
			System.out.println("Base maior:");
			int baseMaior = ler.nextInt();
			System.out.println("Base menor:");
			int baseMenor = ler.nextInt();
			System.out.println("Altura:");
			int altura = ler.nextInt();
			System.out.println("�rea = " + trapezio.area(baseMaior, baseMenor, altura));
		}
	}
	
	
}
