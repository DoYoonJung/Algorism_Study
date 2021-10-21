package algorism;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		int[][] arr = new int[1010][1010];

		int check2 = 0;
		int b = 0;
		int human = 1;

		while (human < k + 5) {

			for (int i = c - 1; i >= 0; i--) {
				if (arr[i][check2] == 0) {
					arr[i][check2] = human;
					human++;
					b = i;
				}
			}

			check2 = b;
			for (int i = 0; i < r; i++) {
				if (arr[check2][i] == 0) {
					arr[check2][i] = human;

					human++;
					b = i;
				}
			}
			check2 = b;

			for (int i = 0; i < c; i++) {
				if (arr[i][check2] == 0) {
					arr[i][check2] = human;

					human++;
					b = i;
				}
			}
			check2 = b;

			for (int i = r - 1; i >= 0; i--) {
				if (arr[check2][i] == 0) {
					arr[check2][i] = human;
					human++;
					b = i;
				}
			}
			check2 = b;
			if (human >= k) {
				break;
			}

		}
		int h = 0;

	}
}