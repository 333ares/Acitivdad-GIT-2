package Actividad_2;

import java.util.Random;
import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO: Implementar las funciones según las ramas asignadas

		// matriz-inicial
		int[][] numeros = new int[5][5]; // Definir matriz.

		Random r = new Random(); // Añado el random que usaré para rellenar la matriz.

		for (int i = 0; i < numeros.length; i++) { // Este bucle se encarga de las filas.
			for (int j = 0; j < numeros.length; j++) { // Este bucle se encraga de las columnas.
				numeros[i][j] = r.nextInt(101); // Relleno la matriz con el random y le establezco un rango de números que puede generar (1 - 100).
			}
		}

    System.out.println("--- MATRIZ ---"); // Muestro un título para la matriz.
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " "); // Muestro la matriz con espacios.

			}
			System.out.println(); // Hago que se muestre línea por línea.
		}

		// busqueda-numero
		Scanner a = new Scanner(System.in); // Escáner para recoger los datos de los usuarios.

		System.out.print("\nBusca un número: "); // Pregunto el número que se quiere buscar.
		int buscador = a.nextInt(); // Guardo esos datos en la variable buscador.

		boolean encontrado = false; // Boolean para determinar si el número se ha encontrado en la matriz.

		for (int i = 0; i < numeros.length; i++) { //
			for (int j = 0; j < numeros[i].length; j++) {
				if (buscador == numeros[i][j]) { // Mientras el número buscado sea igual a algun número de la matriz.
					encontrado = true; // Cambiamos el boolean a true, porque hemos encontrado el número.
					System.out.println("El número esta en la fila " + i + ", columna " + j + "."); // Muestro su posición.
					break; // Salgo del if y del bucle.
				}
			}
		}
		if (!encontrado) { // Si no se ha encontrado el número.
			System.out.print("El número no se ha encontrado."); // Muestro el mensaje.
		}
		
		// suma-matriz
		int sum = 0; // Variable para hacer la suma.
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				sum = sum + numeros[i][j]; // Se suma el valor de la posición [i][j] de la matriz numeros a sum.
			}
		}
		
		System.out.println("\nLa suma de la matriz es " + sum + " ."); // Mostramos el resultado.
	}
}
