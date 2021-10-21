package algorism_Level_05;

import java.util.Scanner;

//streetree
public class Basic_Number_Theory_StreeTree {

	public static void main(String[] args) {

		// Please Enter Your Code Here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n + 10];
		int[] arr = new int[n + 10];

		for (int i = 0; i < n; i++) {
			arr1[i] = in.nextInt();
		}
		int a = 0;
		int k = 0;
		for (int i = n - 1; i > 0; i--) {
			arr[a] = arr1[i] - arr1[i - 1];
			a++;
		}

		for (int i = 0; i < a; i++) {
			for (int j = i; j >= 1; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int abc = 0;
		int tree = 0;
		for (int j = 1; j <= arr[0]; j++) {
			tree = 0;

			if (arr[0] % j == 0) {
				for (int i = 1; i < a; i++) {
					if (arr[i] % j == 0) {
						tree++;
					}
				}
				if (tree == a - 1) {
					if (abc < j) {
						abc = j;
					}
				}
			}
		}

		int aaa = 0;
		for (int i = 0; i < a; i++) {
			aaa += arr[i] / abc - 1;
		}

		System.out.println(aaa);

	}
}