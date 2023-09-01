package ProgramacaoOrientadaObjetoCalcularAreaRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Largura é: ");
		retangulo.largura = sc.nextDouble();
		System.out.println("Altura é: ");
		retangulo.altura = sc.nextDouble();
		
		
		
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		retangulo.calcularDiagonal();
		
		System.out.printf("AREA = %.2f%n", retangulo.calcularArea());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.calcularPerimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.calcularDiagonal());
		
		sc.close();
		

	}

}
