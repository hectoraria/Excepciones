package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

	public double readDouble(Scanner sc) {
		double num = 0;

		try {
			System.out.println("Introduce un valor: ");
			sc.nextDouble();
		} catch (InputMismatchException e) {

			System.err.println("El valor introducido no es de tipo double");
			num=0;
			sc.nextLine();
		}

		return num;

	}

	public int readInt(Scanner sc) {
		int num = 0;

		try {
			System.out.println("Introduce un valor: ");
			sc.nextDouble();
		} catch (InputMismatchException e) {

			System.err.println("El valor introducido no es de tipo double");
			num=0;
			sc.nextLine();
		}

		return num;

	}
}
