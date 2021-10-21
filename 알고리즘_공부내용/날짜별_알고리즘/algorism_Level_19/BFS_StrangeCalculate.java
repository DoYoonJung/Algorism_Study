package algorism_Level_19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_StrangeCalculate {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int[] value = new int[100000];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new LinkedList();

		queue.offer(1);
		value[1] = 1;

		while (!queue.isEmpty()) {

			int a = (int) queue.poll();
			int mul = a * 2;
			int div = (int) a / 3;

			if (mul > 0 && mul < 100000) {
				if (value[mul] == 0) {
					value[mul] = value[a] + 1;
					queue.offer(mul);
				} else {
					value[mul] = Math.min(value[mul], value[a] + 1);
				}
				if (mul == n) {
					break;
				}
			}

			if (div > 0 && div < 100000) {
				if (value[div] == 0) {
					value[div] = value[a] + 1;
					queue.offer(div);
				} else {
					value[div] = Math.min(value[div], value[a] + 1);
				}
				if (div == n) {
					break;
				}
			}
		}

		System.out.println(value[n] - 1);

	}

}
