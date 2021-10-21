package algorism_Level_03;

//°ËÁõ¼ö
import java.util.Scanner;

public class Simple_Brute_ForceAlgorithm_investigation {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);

		int[] arr = new int[5];
		int a = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
			a += arr[i] * arr[i];
		}

		a = a % 10;
		System.out.println(a);
	}
}