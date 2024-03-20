package targetSistemas.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a number to check if it is in the fibonacci sequence:"
				+ "\nEscreva um número para checar se ele está na sequencia de fibonacci:");
		int test = input.nextInt();
		boolean result = fibonacciChecker(test);

		if (result) {
			System.out
					.println(test + " is in the fibonacci sequence!" + "\n" + test + " está na sequencia de fibonacci!");
		} else {
			System.out
			.println(test + " is not in the fibonacci sequence!" + "\n" + test + " não está na sequencia de fibonacci!");
		}

	}

	public static boolean fibonacciChecker(int n) {
		int f1 = 0, f2 = 1;

		while (f2 < n) {
			int fn = f1 + f2;
			f1 = f2;
			f2 = fn;
		}

		return f2 == n;
	}

}
