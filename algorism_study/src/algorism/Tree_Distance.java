package algorism;

import java.util.Scanner;

public class Tree_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int x = in.nextInt();
		int y = in.nextInt();

		int[][] arr = new int[1050][5];

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int[] xInx = new int[n];
		int[] yInx = new int[n];
		xInx[0] = x;
		yInx[0] = y;

		int xCount = 1;
		int yCount = 1;

		while (true) {

			if (x != 0) {
				for (int i = 0; i < n - 1; i++) {
					if (arr[i][1] == x) {
						xInx[xCount] = arr[i][0];
						xCount++;
					}
				}
				x = xInx[xCount - 1];
			}

			if (y != 0) {
				for (int i = 0; i < n - 1; i++) {
					if (arr[i][1] == y) {
						yInx[yCount] = arr[i][0];

						yCount++;
					}
				}
				y = yInx[yCount - 1];
			}

			if (x == 0 && y == 0) {
				break;
			}

		}
		int cnt = -1;
		for (int i = 0; i < xCount - 1; i++) {
			for (int j = 0; j < yCount - 1; j++) {
				if (xInx[i] == yInx[j]) {
					cnt = i + j;
					break;
				}
			}
			if (cnt != -1) {
				break;
			}
		}
		if (cnt == -1) {
			System.out.println((yCount - 1) + (xCount - 1));

		} else {
			System.out.println(cnt);
		}

	}

}
