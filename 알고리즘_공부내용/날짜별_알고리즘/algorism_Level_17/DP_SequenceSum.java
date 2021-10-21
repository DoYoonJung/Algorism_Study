package algorism_Level_17;

//연속부분최대합L
import java.util.Scanner;

public class DP_SequenceSum {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int[] table = new int[n + 5];
	static int[] data = new int[n + 5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			data[i] = in.nextInt();
		}

		table[0] = data[0];

		for (int i = 1; i < n; i++) {
			if (data[i] + table[i - 1] > data[i]) {
				table[i] = data[i] + table[i - 1];
			} else {
				table[i] = data[i];
			}
		}

		int max = -99999;

		for (int i = 0; i < n; i++) {
			if (max < table[i]) {
				max = table[i];
			}
		}

		System.out.println(max);

	}

}
