package algorism_Level_16;

//직사각형의 합
import java.util.Scanner;

public class DP_squre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		long area[][] = new long[n][m];

		for (int i = 0; i < n; i++) {
			long sum = 0;
			for (int j = 0; j < m; j++) {
				sum += sc.nextLong();
				if (i > 0)
					area[i][j] = sum + area[i - 1][j];
				else
					area[i][j] = sum;
			}
		}

		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			long sum = 0;
			if (a == 0 && b == 0)
				sum = area[c][d];
			else if (a > 0 && b > 0)
				sum = area[c][d] - area[c][b - 1] - area[a - 1][d] + area[a - 1][b - 1];
			else if (a == 0)
				sum = area[c][d] - area[c][b - 1];
			else if (b == 0)
				sum = area[c][d] - area[a - 1][d];

			System.out.println(sum);

		}
	}

}
