package Actividad_2;

import java.util.Random;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO: Implementar las funciones según las ramas asignadas

		// Generar y mostrar la matriz de números aleatorios
		int[][] matriz = new int[5][5];

		Random r = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(101);
			}
		}

		System.out.println("--- MATRIZ ---");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Búsqueda de un número

	}

}
