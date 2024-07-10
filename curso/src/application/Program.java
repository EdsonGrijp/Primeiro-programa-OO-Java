package application;

import java.util.Scanner;

import entitites.Triangle;

public class Program {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();	
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c)/2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		double b = (y.a + y.b + y.c)/2;
		double areaY = Math.sqrt(b * (b - y.a) * (b - y.b) * (b - y.c));
		
		
		System.out.println("Área do triângulo X: " + areaX);
		System.out.println("Área do triângulo X: " + areaY);
		
		if(areaX > areaY) {
			System.out.println("O maior triângulo é o X");
		}else {
			System.out.println("O maior triângulo é o Y");
			}
	sc.close();	
	}
}
