package br.com.estudos;

import java.util.Scanner;

public class MatrizNegativoseDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int N = sc.nextInt();

		//Utilizamos essa variável para instanciar a matriz na memória.
		int[][] matriz = new int[N][N];

		// Preenchendo a matriz
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		// Mostrando a diagonal principal
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < N; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// Contando os negativos
		int negativos = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matriz[i][j] < 0) {
					negativos++;
				}
			}
		}

		// Exibindo a quantidade de negativos
		System.out.println("QUANTIDADE DE NEGATIVOS = " + negativos);

		sc.close();
	}
}
