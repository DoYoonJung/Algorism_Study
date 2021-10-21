package algorism;

import java.util.Scanner;

public class Divide_And_Conquer_MaxSum {
	static Scanner in = new Scanner(System.in);
	static final int MAX = 100005;
	static int n = in.nextInt();
	static int[] data = new int[MAX];

	public static int getSum(int start, int end) {
		if (start >= end)
			return data[start];

		int mid = (start + end) / 2;

		int left = getSum(start, mid);
		int right = getSum(mid + 1, end);

		int leftSum = 0;
		int leftMax = -9999999;

		for (int i = mid; i >= start; i--) {
			leftSum = leftSum + data[i];
			if (leftSum > leftMax) {
				leftMax = leftSum;
			}
		}

		int rightSum = 0;
		int rightMax = -9999999;

		for (int i = mid + 1; i <= end; i++) {
			rightSum = rightSum + data[i];
			if (rightSum > rightMax) {
				rightMax = rightSum;
			}
		}

		int Max = rightMax + leftMax;

		if (right >= Max && right >= left) {
			return right;
		} else if (left >= Max && left >= right) {
			return left;
		} else {
			return Max;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			data[i] = in.nextInt();
		}

		System.out.println(getSum(0, n - 1));
	}

}
