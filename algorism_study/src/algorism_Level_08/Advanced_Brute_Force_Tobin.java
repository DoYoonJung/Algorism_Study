package algorism_Level_08;

import java.util.Scanner;

//tobin
public class Advanced_Brute_Force_Tobin {

	static int[] arr = new int[100];
	static int cnt = 0;

	public static void getResult(int x, int n, int k) {
		if (cnt > k) {
			return;
		}

		if (x >= n) {
			if (k == cnt) {
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			} else {
				return;
			}
		} else {
			arr[x] = 1;
			cnt++;
			getResult(x + 1, n, k);
			cnt--;
			arr[x] = 0;
			getResult(x + 1, n, k);

		}
	}

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();

		getResult(0, n, k);
	}
}