package algorism_Level_13;

import java.util.Scanner;

//트리 순회 결과 출력하기
public class Tree_OutputOfTreeTraversalResults {

	static int[][] arr = new int[105][5];
	static int scale;

	public static void first(int x) {
		if (arr[x][0] == -1 && arr[x][1] == -1) {
			System.out.print(x + " ");
		} else {
			System.out.print(x + " ");

			if (arr[x][0] != -1) {
				first(arr[x][0]);
			}

			if (arr[x][1] != -1) {
				first(arr[x][1]);
			}
		}
	}

	public static void second(int x) {
		if (arr[x][0] == -1 && arr[x][1] == -1) {
			System.out.print(x + " ");
		} else {
			if (arr[x][0] != -1) {
				second(arr[x][0]);
			}
			System.out.print(x + " ");
			if (arr[x][1] != -1) {
				second(arr[x][1]);
			}
		}
	}

	public static void third(int x) {
		if (arr[x][0] == -1 && arr[x][1] == -1) {
			System.out.print(x + " ");
		} else {
			if (arr[x][0] != -1) {
				third(arr[x][0]);
			}
			if (arr[x][1] != -1) {
				third(arr[x][1]);
			}
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		scale = in.nextInt();

		for (int i = 0; i < scale; i++) {

			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();

			arr[a][0] = b;
			arr[a][1] = c;

		}

		first(0);
		System.out.println();
		second(0);
		System.out.println();
		third(0);
		System.out.println();

	}

}
