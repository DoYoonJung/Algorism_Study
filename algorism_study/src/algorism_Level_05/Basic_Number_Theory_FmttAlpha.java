package algorism_Level_05;

import java.util.Scanner;

//fmttalpha
public class Basic_Number_Theory_FmttAlpha {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int dis = m - n;
		int move = 1;
		int moved = 0;
		int check = 0;

		while (moved < dis) {
			check++;
			moved += move;

			if (check % 2 == 0) {
				move++;
			}
		}

		System.out.print(check);

	}
}