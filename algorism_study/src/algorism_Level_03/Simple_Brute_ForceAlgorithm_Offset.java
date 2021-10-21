package algorism_Level_03;

import java.util.Scanner;

public class Simple_Brute_ForceAlgorithm_Offset {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i >= 1 && i <= 3) && (j >= 1 && j <= 3)) {
					if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i][j + 1] && arr[i][j] < arr[i + 1][j]
							&& arr[i][j] < arr[i - 1][j]) {
						arr[i][j] = -1;
					}
				} else if (i == 0 && j == 0) {
					if (arr[i][j] < arr[i][j + 1] && arr[i][j] < arr[i + 1][j]) {
						arr[i][j] = -1;
					}
				} else if (i == 0 && j == 4) {
					if (arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i][j - 1]) {
						arr[i][j] = -1;
					}
				} else if (i == 4 && j == 0) {
					if (arr[i][j] < arr[i][j + 1] && arr[i][j] < arr[i - 1][j]) {
						arr[i][j] = -1;
					}
				} else if (i == 4 && j == 4) {
					if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i - 1][j]) {
						arr[i][j] = -1;
					}
				} else if (i == 0 && (j >= 1 && j <= 3)) {
					if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i][j + 1]) {
						arr[i][j] = -1;
					}
				} else if (i == 4 && (j >= 1 && j <= 3)) {
					if (arr[i][j] < arr[i][j - 1] && arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i][j + 1]) {
						arr[i][j] = -1;
					}
				} else if ((i >= 1 && i <= 3) && j == 0) {
					if (arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i][j + 1]) {
						arr[i][j] = -1;
					}
				} else if ((i >= 1 && i <= 3) && j == 4) {
					if (arr[i][j] < arr[i - 1][j] && arr[i][j] < arr[i + 1][j] && arr[i][j] < arr[i][j - 1]) {
						arr[i][j] = -1;
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j] == -1) {
					System.out.print("*" + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}
}