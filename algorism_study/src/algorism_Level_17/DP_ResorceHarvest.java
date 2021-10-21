package algorism_Level_17;

//자원채취
import java.util.Scanner;

public class DP_ResorceHarvest {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static int[][] data = new int[n + 2][m + 2];
	static int[][] table = new int[n + 2][m + 2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0) {
					if (j == 0) {
						table[i][j] = data[i][j];
					} else {
						table[i][j] = data[i][j] + table[i][j - 1];
					}

				}

				else if (j == 0) {
					if (i == 0) {
						table[i][j] = data[i][j];
					} else {
						table[i][j] = data[i][j] + table[i - 1][j];
					}
				} else {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]) + data[i][j];
				}
			}
		}

		System.out.println(table[n - 1][m - 1]);

	}

}
