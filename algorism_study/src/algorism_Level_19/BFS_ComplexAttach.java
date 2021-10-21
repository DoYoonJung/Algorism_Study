package algorism_Level_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_ComplexAttach {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	static int count = 1;
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	static int[][] map = new int[n + 5][n + 5];

	static int[] xx = { 0, 0, 1, -1 };
	static int[] yy = { -1, 1, 0, 0 };

	static boolean[][] check = new boolean[n + 5][n + 5];

	public static void BFS(int y, int x) {
		Queue one = new LinkedList();
		Queue two = new LinkedList();

		one.offer(y);
		two.offer(x);
		check[y][x] = true;

		while (!one.isEmpty()) {
			int y1 = (int) one.poll();
			int x1 = (int) two.poll();

			for (int i = 0; i < 4; i++) {
				int y2 = y1 + yy[i];
				int x2 = x1 + xx[i];

				if (y2 >= 0 && x2 >= 0 && y2 < n && x2 < n) {
					if (check[y2][x2] == false && map[y2][x2] == 1) {
						check[y2][x2] = true;
						map[y2][x2] = count;
						one.offer(y2);
						two.offer(x2);
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			String input = in.next();
			for (int j = 0; j < n; j++) {
				map[i][j] = input.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && check[i][j] == false) {
					BFS(i, j);
					count++;
				}
			}
		}

		int[] data = new int[count];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] != 0) {
					data[map[i][j]]++;
				}
			}
		}

		System.out.println(count - 1);
		Arrays.sort(data);
		for (int i = 1; i < count; i++) {
			System.out.println(data[i]);
		}

	}

}
