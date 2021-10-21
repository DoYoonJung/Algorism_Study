package algorism_Level_14;

import java.util.Scanner;

//°ÅµìÁ¦°ö ±¸ÇÏ±âL
public class Adv_Recursive_Function_FindingThePower {

	static Scanner in = new Scanner(System.in);
	static long n = in.nextLong();
	static long m = in.nextLong();
	static int b = 0;

	public static long getSum(long n, long m) {
		if (m == 0) {
			return 1;
		} else {
			if (m % 2 == 0) {
				long temp = getSum(n, m / 2);
				return temp * temp % 10007;
			} else {
				return getSum(n, m - 1) * n % 10007;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = getSum(n, m);
		System.out.println(a);

	}

}
