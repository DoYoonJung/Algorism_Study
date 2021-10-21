package algorism_Level_03;

import java.util.Scanner;

//´ëÇ©°ª
public class Simple_Brute_ForceAlgorithm_RepresentativeValue {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[] arr = new int[10];
		int[] abc = new int[1010];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / 10);

		for (int i = 0; i < 10; i++) {
			abc[arr[i]]++;
		}
		int d = 0;
		int d1 = 0;
		for (int i = 0; i < 1010; i++) {
			if (d < abc[i]) {
				d = abc[i];
				d1 = i;
			}

		}

		System.out.println(d1);
	}
}