package algorism_Level_13;

import java.util.Scanner;

//���� ���� ã��
public class Tree_FindingCommonAncestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int x = in.nextInt();
		int y = in.nextInt();

		int[][] arr = new int[1050][5];

		int[] xResult = new int[n];
		int[] yResult = new int[n];

		int xCount = 0;
		int yCount = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = in.nextInt();

			}

		}

		while (true) {
			int xx = -1;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i][1] == x) {
					xResult[xCount] = arr[i][0];
					xCount++;
					xx = i;
				}
			}
			if (xx != -1) {
				x = arr[xx][0];
			}

			int yy = -1;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i][1] == y) {
					yResult[yCount] = arr[i][0];
					yCount++;
					yy = i;
				}
			}
			if (yy != -1) {
				y = arr[yy][0];
			}

			if (xx == -1 && yy == -1) {
				break;
			}

		}
		for (int i = 0; i < yCount; i++) {
			for (int j = 0; j < xCount; j++) {
				if (yResult[i] == xResult[j]) {
					x = -1;
					y = yResult[i];
					break;
				}
			}
			if (x == -1) {
				break;
			}
		}

		System.out.println(y);

	}

}