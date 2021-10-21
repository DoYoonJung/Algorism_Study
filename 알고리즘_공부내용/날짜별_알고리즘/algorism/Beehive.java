package algorism;

import java.util.Scanner;

public class Beehive {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		int a = 1;
		int b = 1;

		int[][] arr = new int[1000010][5];
		arr[0][0] = 1;
		if (answer == 1) {
			System.out.println(1);
		} else {
			while (true) {
				b = b + 6 * a;

				arr[a][0] = b;
				if (arr[a][0] >= answer) {
					break;
				}
				a++;
			}
			System.out.println(a + 1);
		}

	}
}
