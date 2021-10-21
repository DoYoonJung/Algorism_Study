package algorism_Level_04;

import java.util.Scanner;

//tetris
public class Simple_Brute_ForceAlgorithm2_Tetris {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		int r = in.nextInt();
		int[][] arr = new int[25][25];
		int[][] arr1 = new int[25][25];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = in.nextInt();

			}
		}

		int a2 = 0;
		int count = 0;
		int aaa = -1;
		int check = 1;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (arr[i][j] == 0) {
					check = 0;

					for (int k = 0; k < 4; k++) {
						if (i + k >= r) {
							check = 1;

						} else if (arr[i + k][j] == 1) {
							check = 1;
						}
					}

					for (int o = i; o >= 0; o--) {
						if (arr[o][j] == 1) {
							check = 1;
						}
					}

					if (check == 0) {

						if ((i + 4) < r && arr[i + 4][j] == 0) {
							a2 = 1;
						}

						else {
							for (int h = 0; h < r; h++) {
								for (int x = 0; x < c; x++) {
									arr1[h][x] = arr[h][x];

								}
							}
							for (int h = 0; h < 4; h++) {
								arr1[i + h][j] = 1;
							}

							int cnt = 0;
							int bing = 0;
							for (int h = 0; h < r; h++) {
								for (int x = 0; x < c; x++) {
									if (arr1[h][x] == 1) {
										cnt++;

									} else {
										cnt = 0;
									}
								}
								if (cnt == c) {
									bing++;

								}
								cnt = 0;
							}

							if (count < bing) {
								count = bing;
								aaa = j + 1;
							}

						}
					}
				}

			}
		}
		if (aaa == -1 && count == 0) {
			System.out.print(0 + " ");
			System.out.print(count + " ");
		} else {
			System.out.print(aaa + " ");
			System.out.print(count + " ");
		}

	}
}
