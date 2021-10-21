package algorism_Level_14;

import java.util.Scanner;

//goodseq
public class Adv_Recursive_Function_GoodSeq {

	static Scanner in = new Scanner(System.in);
	static int n = in.nextInt();
	static int[] arr = new int[n + 5];

	static String result = "";
	static int flag = 0;

	public static void getSum(int x) {

		if (x >= n) {

			for (int i = 0; i < n; i++) {
				result += arr[i];
			}
			flag = 1;

		} else {
			for (int i = 1; i <= 3; i++) {
				if (flag == 1) {
					return;
				}
				if (arr[x] == 0) {
					arr[x] = i;

					int cnt = 1;
					if (x >= 1) {

						while (cnt * 2 <= x + 1) {
							String one = "";
							String two = "";
							for (int x1 = x; x1 > x - cnt; x1--) {
								one += arr[x1] + "";
							}

							for (int x2 = x - cnt; x2 >= x - 2 * cnt + 1; x2--) {
								two += arr[x2] + "";
							}

							if (one.equals(two)) {
								cnt = -1;
								break;
							}
							cnt++;
						}
					}

					if (cnt != -1) {
						getSum(x + 1);
						arr[x] = 0;
					} else {
						arr[x] = 0;
					}

				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum(0);

		System.out.println(result);

	}

}