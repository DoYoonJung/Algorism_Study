package algorism_Level_05;

import java.util.Scanner;

//combinationzero
public class Basic_Number_Theory_CombinationZero {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		long n = in.nextInt();
		long m = in.nextInt();

		int count2 = 0;
		int count5 = 0;
		int two = 0;
		int five = 0;

		for (int i = 1; i <= n; i++) {
			int num = i;
			while (true) {
				if (num % 2 == 0) {
					num = num / 2;
					count2++;
				}
				if (num % 5 == 0) {
					num = num / 5;
					count5++;
				}

				if (num % 2 != 0 && num % 5 != 0) {
					break;
				}
			}
		}

		for (int i = 1; i <= m; i++) {
			int num = i;
			while (true) {
				if (num % 2 == 0) {
					num = num / 2;
					two++;
				}
				if (num % 5 == 0) {
					num = num / 5;
					five++;
				}

				if (num % 2 != 0 && num % 5 != 0) {
					break;
				}
			}
		}
		for (int i = 1; i <= n - m; i++) {
			int num = i;
			while (true) {
				if (num % 2 == 0) {
					num = num / 2;
					two++;
				}
				if (num % 5 == 0) {
					num = num / 5;
					five++;
				}

				if (num % 2 != 0 && num % 5 != 0) {
					break;
				}
			}
		}
		int a = count2 - two;
		int b = count5 - five;
		if (a > b) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}

	}
}