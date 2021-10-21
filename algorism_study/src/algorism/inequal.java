package algorism;

import java.util.Scanner;

public class inequal {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int cnt = 0;
	static int[] number = new int[n + 5];
	static String[] arr = new String[n + 5];

	static boolean[] check = new boolean[10];

	static String low = "10000000000";
	static String high = "0";

	public static void getResult(int x, int n) {
		if (x >= n + 1) {
			String a = "";
			for (int i = 0; i < x; i++) {
				a += number[i] + "";
			}
			long b = Long.parseLong(a);
			if (Long.parseLong(low) > b) {
				low = a;
			}
			if (Long.parseLong(high) < b) {
				high = a;
			}
		} else {
			for (int i = 0; i < 10; i++) {
				if (check[i] == false) {
					number[x] = i;
					if (x != 0 && arr[x - 1].equals(">")) {
						if (number[x - 1] <= number[x]) {
							break;
						}
					} else if (x != 0 && arr[x - 1].equals("<")) {
						if (number[x - 1] >= number[x]) {
							i++;
							continue;

						}
					}
					check[i] = true;
					getResult(x + 1, n);
					check[i] = false;
					number[x] = -1;

				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			arr[i] = in.next();
		}
		for (int i = 0; i < n + 1; i++) {
			number[i] = -1;
		}
		getResult(0, n);
		System.out.println(high);
		System.out.println(low);

	}
}
