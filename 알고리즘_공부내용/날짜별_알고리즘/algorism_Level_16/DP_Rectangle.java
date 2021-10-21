package algorism_Level_16;

//직사각형배치의경우의수
import java.util.Scanner;

public class DP_Rectangle {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int[] data = new int[105];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data[1] = 1;
		data[2] = 2;

		for (int i = 3; i <= n; i++) {
			data[i] = (data[i - 1] + data[i - 2]) % 1000007;
		}
		System.out.println(data[n]);

	}

}
