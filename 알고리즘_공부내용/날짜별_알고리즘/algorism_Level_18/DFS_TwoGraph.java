package algorism_Level_18;

//이분그래프 판별
import java.util.ArrayList;
import java.util.Scanner;

public class DFS_TwoGraph {
	static Scanner in = new Scanner(System.in);

	static int n = in.nextInt();
	static int m = in.nextInt();

	static ArrayList<ArrayList<Integer>> data = new ArrayList<ArrayList<Integer>>();

	static boolean[] visit = new boolean[n + 5];

	static int[] check = new int[n + 5];
	static int count = 0;
	static String flag = "Yes";

	public static void DFS(int x) {

		visit[x] = true;
		check[count] = x;
		count++;
		for (int i = 0; i < data.get(x).size(); i++) {

			if (count >= 3 && data.get(x).get(i) == check[count - 3]) {
				flag = "No";
			}

			if (visit[data.get(x).get(i)] == false) {

				DFS(data.get(x).get(i));
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= n; i++) {
			data.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			data.get(a).add(b);
			data.get(b).add(a);
		}

		DFS(1);
		System.out.println(flag);
	}

}
