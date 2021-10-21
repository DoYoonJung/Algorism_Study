package algorism_Level_16;

//버튼누르기
import java.util.Scanner;

public class DP_ButtonPush {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();

	static int[] data = new int[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data[0] = in.nextInt();
		data[1] = in.nextInt();
		data[2] = in.nextInt();

		for (int i = 1; i < n; i++) {
			int a = Math.max(data[1], data[2]);
			int b = Math.max(data[0], data[2]);
			int c = Math.max(data[0], data[1]);

			data[0] = in.nextInt() + a;
			data[1] = in.nextInt() + b;
			data[2] = in.nextInt() + c;
		}

		int max = Math.max(data[0], data[1]);
		max = Math.max(data[2], max);

		System.out.println(max);
	}

}
