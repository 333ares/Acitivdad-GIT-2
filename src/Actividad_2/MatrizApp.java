package Actividad_2;

import java.util.Random;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO: Implementar las funciones según las ramas asignadas

		// matriz-inicial
		int[][] numeros = new int[5][5]; // Definir matriz.

		Random r = new Random(); // Añado el random que usaré para rellenar la matriz.

		for (int i = 0; i < numeros.length; i++) { // Este bucle se encarga de las filas.
			for (int j = 0; j < numeros.length; j++) { // Este bucle se encraga de las columnas.
				numeros[i][j] = r.nextInt(101); // Relleno la matriz con el random y le establezco un rango de números
												// que puede generar (1 - 100).
			}
		}

		System.out.println("--- MATRIZ ---"); //Muestro un título para la matriz.
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " "); //Muestro la matriz con espacios.
			}
			System.out.println(); //Hago que se muestre línea por línea.
		}

		// Búsqueda de un número

	}

}
