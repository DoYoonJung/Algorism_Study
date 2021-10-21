package algorism_Level_17;

//팰린드롬만들기
import java.util.Scanner;

public class DP_Palindrome {
	static Scanner in = new Scanner(System.in);

	static String n = in.next();
	static int m = n.length();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[m + 5][m + 5];
		String[] data = new String[m + 5];

		for (int i = 0; i < m; i++) {
			data[i] = n.substring(i, i + 1);
		}

		for (int i = m - 1; i >= 0; i--) {

			for (int j = i; j < m; j++) {
				if (i == j) {
					table[i][j] = 0;
				}

				else if (data[i].equals(data[j])) {
					table[i][j] = table[i + 1][j - 1];
				} else {
					int min = Math.min(table[i + 1][j], table[i][j - 1]) + 1;
					table[i][j] = min;
				}
			}
		}

		System.out.println(table[0][m - 1]);

	}

}
