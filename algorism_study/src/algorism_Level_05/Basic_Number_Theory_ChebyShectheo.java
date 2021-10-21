package algorism_Level_05;

import java.util.Scanner;

//chebychevtheo
public class Basic_Number_Theory_ChebyShectheo {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		while (true) {
			long a = in.nextInt();
			if (a == 0) {
				break;
			}

			long cnt = 0;
			for (long i = a + 1; i <= 2 * a; i++) {
				int check = 0;
				for (long k = 2; k <= Math.sqrt(i); k++) {
					if (i % k == 0) {
						check = 1;
						break;
					}
				}
				if (check == 0) {
					cnt++;
				}

			}

			System.out.println(cnt);

		}

	}
}