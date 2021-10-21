package algorism_Level_03;

import java.util.Scanner;

//Car
public class Simple_Brute_ForceAlgorithm_Car {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int[] arr = new int[5];
		int b = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (a == arr[i]) {
				b++;
			}
		}

		System.out.println(b);
	}
}