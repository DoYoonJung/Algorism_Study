package algorism_Level_16;

//구슬 게임
import java.util.Scanner;

public class DP_MarbleGame {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1000005];

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;

		for (int i = 4; i <= n; i++) {
			if (!(arr[i - 3] == 1 && arr[i - 2] == 1 && arr[i - 1] == 1)) {
				arr[i] = 1;
			} else {
				arr[i] = 0;
			}
		}

		if (arr[n] == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
