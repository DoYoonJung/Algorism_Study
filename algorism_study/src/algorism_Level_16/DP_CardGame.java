package algorism_Level_16;

//Ä«µå³îÀÌ
import java.util.Scanner;

public class DP_CardGame {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[3];

		int a = in.nextInt();
		data[0] = 0;
		data[1] = a;
		data[2] = 0;

		for (int i = 1; i < n; i++) {
			int max = Math.max(data[0], data[1]);
			max = Math.max(max, data[2]);
			int b = in.nextInt();
			data[2] = data[1] + b;
			data[1] = data[0] + b;

			data[0] = max;

		}

		int mm = Math.max(data[0], data[1]);
		System.out.println(Math.max(mm, data[2]));
	}

}
