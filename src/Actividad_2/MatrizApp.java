package Actividad_2;

import java.util.Scanner;

public class MatrizApp {

	public static void main(String[] args) {
		// TODO: Implementar las funciones según las ramas asignadas
		
		//Generar y mostrar la matriz de números aleatorios
		
		//Búsqueda de un número
		Scanner a = new Scanner(System.in);
		
		System.out.print("Busca un número: ");
		int buscador = a.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				if (buscador == numeros[i][j]) {
					encontrado = true;
					System.out.println("El número esta en la fila " + i + ", columna " + j + ".");
					break;
				} 
			}
		}
	}

}
