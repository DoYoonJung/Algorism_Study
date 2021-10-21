package algorism_Level_16;

//숫자만들기
import java.util.Scanner;

public class DP_MakeCount {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int[] data = new int[n + 5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		data[1] = 1;
		int sum = 0;
		for (int i = 2; i <= m; i++) {
			sum += data[i - 1];
			data[i] = sum + 1;
		}

		for (int i = m + 1; i <= n; i++) {
			for (int j = i - m; j <= i - 1; j++) {
				data[i] += data[j];

			}
		}
		int a = data[n] % 1000007;
		System.out.println(a);
	}

}
