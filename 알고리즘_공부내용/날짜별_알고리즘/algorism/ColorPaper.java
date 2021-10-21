package algorism;

import java.util.Scanner;

public class ColorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[][] table = new int[110][8];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				table[i][j] = in.nextInt();
			}

		}
		int[][] arr = new int[110][110];
		int a = 0;
		int b = 1;

		int[] answer = new int[n + 10];
		for (int i = 0; i < n; i++) {

			for (int k = table[a][0]; k < table[a][0] + table[a][3]; k++) {
				for (int h = table[a][1]; h < table[a][1] + table[a][2]; h++) {
					arr[k][h] = b;

				}
			}
			answer = new int[n + 10];
			for (int k = 0; k < 101; k++) {

				for (int h = 0; h < 101; h++) {
					answer[arr[k][h]]++;
				}

			}

			b++;
			a++;

		}

		for (int i = 1; i <= n; i++) {
			System.out.println(answer[i]);
		}
	}
}
