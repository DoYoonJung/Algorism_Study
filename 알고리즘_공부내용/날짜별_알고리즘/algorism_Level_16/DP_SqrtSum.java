package algorism_Level_16;

//Á¦°ö¼öÀÇ ÇÕ
import java.util.Scanner;

public class DP_SqrtSum {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[100005];

		for (int i = 1; i <= n; i++) {
			data[i] = i;
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j * j <= i; j++) {

				if (data[i] > data[i - j * j] + 1)
					data[i] = data[i - j * j] + 1;
			}
		}

		System.out.println(data[n]);
	}

}
