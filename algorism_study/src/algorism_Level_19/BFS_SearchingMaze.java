package algorism_Level_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_SearchingMaze {

	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();
	static int[] xx = { 0, 0, -1, 1 };
	static int[] yy = { -1, 1, 0, 0 };

	static int[][] map = new int[n + 5][m + 5];

	public static void BFS() {
		Queue x = new LinkedList();
		Queue y = new LinkedList();

		x.offer(0);
		y.offer(n - 1);

		map[n - 1][0] = 0;

		while (!x.isEmpty()) {

			int x1 = (int) x.poll();
			int y1 = (int) y.poll();

			for (int i = 0; i < 4; i++) {
				int x2 = x1 + xx[i];
				int y2 = y1 + yy[i];

				if (x2 >= 0 && y2 >= 0 && x2 < m && y2 < n) {
					if (map[y2][x2] == 0) {
						map[y2][x2] = map[y1][x1] + 1;

						x.offer(x2);
						y.offer(y2);
					}

				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = in.nextInt();
			}
		}

		BFS();

		System.out.println(map[0][m - 1]);

	}

}
