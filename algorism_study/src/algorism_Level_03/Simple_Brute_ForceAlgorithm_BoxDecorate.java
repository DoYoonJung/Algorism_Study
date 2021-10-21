package algorism_Level_03;

import java.util.Scanner;

//상자 꾸미기
public class Simple_Brute_ForceAlgorithm_BoxDecorate {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int[] arr = new int[1010];
		int[][] n = new int[1010][2];

		for (int i = 0; i < 1010; i++) {
			n[i][0] = i + 1;
		}

		for (int i = 0; i < a; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < 1010; i++) {
			for (int j = 0; j < 1010; j++) {
				if (n[i][0] == arr[j]) {
					n[i][1]++;
				}
			}
		}
		int cnt = 0;
		for (int i = 0; i < 1010; i++) {

			if (n[i][1] != 0) {
				if (n[i][1] > 2) {
					cnt += 2;
				} else {
					cnt += n[i][1];
				}
			}

		}

		if (cnt >= 6) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}