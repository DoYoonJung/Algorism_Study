package algorism_Level_03;

import java.util.Scanner;

//rook
public class Simple_Brute_ForceAlgorithm_Rook {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[8][8];
		int a = -1;
		int b = -1;
		int c = -1;
		int d = -1;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				arr[i][j] = in.nextInt();

			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == 2) {
					for (int k = 0; k < 8; k++) {
						if (arr[i][k] == 1) {
							a = 1;
							b = k;
						}
					}

					if (b != -1) {
						if (j < b) {
							c = b;
							d = j;

						} else {
							c = j;
							d = b;
						}

						for (int p = d; p <= c; p++) {
							if (arr[i][p] == 3) {
								a = 0;
							}

						}

					}
					for (int k = 0; k < 8; k++) {
						if (arr[k][j] == 1) {
							a = 1;
							b = k;
						}
					}
					if (b != -1) {
						if (j < b) {
							c = b;
							d = j;

						} else {
							c = j;
							d = b;
						}

						for (int p = d; p <= c; p++) {
							if (arr[i][p] == 3) {
								a = 0;
							}

						}

					}

				}

			}
		}

		if (a == -1) {
			a = 0;
		}

		System.out.println(a);

	}
}
