package test1;

import java.util.Scanner;

public class Pitagoras {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el valor del cateto a: ");
		double catetoA = scanner.nextDouble();

		System.out.print("Ingrese el valor del cateto b: ");
		double catetoB = scanner.nextDouble();

		double cuadradoCatetoA = Math.pow(catetoA, 2);
		double cuadradoCatetoB = Math.pow(catetoB, 2);

		double hipotenusa = Math.sqrt(cuadradoCatetoA + cuadradoCatetoB);

		System.out.println("La hipotenusa es: " + hipotenusa);

	}

}
