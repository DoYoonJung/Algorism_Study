package algorism_Level_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_TwoColoring {

	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	static int[] check = new int[n + 5];
	static String flag = "YES";

	public static void BFS() {
		Queue queue = new LinkedList();

		queue.offer(0);
		check[0] = 1;

		while (!queue.isEmpty()) {
			if (flag.equals("NO")) {
				break;
			}
			int a = (int) queue.peek();
			queue.poll();

			for (int i = 0; i < arr.get(a).size(); i++) {

				int next = arr.get(a).get(i);

				if (check[a] == 1 && check[next] == 1) {
					flag = "NO";
					break;
				} else if (check[a] == 2 && check[next] == 2) {
					flag = "NO";
					break;
				}

				if (check[a] == 1 && check[next] == 0) {
					check[next] = 2;
					queue.offer(next);
				} else if (check[a] == 2 && check[next] == 0) {
					check[next] = 1;
					queue.offer(next);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= n; i++) {
			arr.add(new ArrayList<>());

		}

		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			arr.get(a).add(b);
			arr.get(b).add(a);
		}

		BFS();
		System.out.println(flag);
	}

}
