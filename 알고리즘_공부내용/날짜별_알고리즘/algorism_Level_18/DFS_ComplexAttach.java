package algorism_Level_18;

//단지 번호 붙이기
import java.util.Arrays;
import java.util.Scanner;

public class DFS_ComplexAttach {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	static int[][] map = new int[n + 5][n + 5];
	static boolean[][] visit = new boolean[n + 5][n + 5];
	static int[] xx = { 0, 0, 1, -1 };
	static int[] yy = { -1, 1, 0, 0 };

	static int count = 2;

	public static void DFS(int x, int y) {
		visit[x][y] = true;
		map[x][y] = count;
		for (int i = 0; i < 4; i++) {
			int xxx = x + xx[i];
			int yyy = y + yy[i];

			if (xxx >= 0 && yyy >= 0 && xxx < n && yyy < n) {
				if (map[xxx][yyy] == 1 && visit[xxx][yyy] == false) {
					DFS(xxx, yyy);
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
				if (map[i][j] == 1 && visit[i][j] == false) {
					DFS(i, j);
					count++;
				}
			}

		}
		System.out.println(count - 2);
		int[] arr = new int[count];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] != 0) {
					arr[map[i][j]]++;
				}
			}
		}
		Arrays.sort(arr);
		for (int i = 2; i < count; i++) {
			System.out.println(arr[i]);
		}

	}

}
