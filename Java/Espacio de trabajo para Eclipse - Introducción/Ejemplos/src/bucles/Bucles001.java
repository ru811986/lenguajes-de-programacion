package bucles;

import java.util.Scanner;

public class Bucles001 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduzca el inicio: ");
			int inicio = sc.nextInt();
			System.out.print("Introduzca el fin: ");
			int fin = sc.nextInt();
			System.out.println("Números del bucle");
			for (int i = inicio; i <= fin; i++) {
				if (i != fin) {
					System.out.print(i + ", ");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
