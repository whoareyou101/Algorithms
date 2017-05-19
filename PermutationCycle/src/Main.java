import java.util.Scanner;

//Graph Search - DFS
//question number 10451(순열사이클)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.permutationCycle();
	}

	public void permutationCycle() {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int result = 0;
			int num = sc.nextInt();

			int[] arr = new int[num];
			boolean[] isVisited = new boolean[num];

			// set arr
			for (int j = 0; j < num; j++) {
				arr[j] = sc.nextInt();
			}

			for (int k = 0; k < num; k++) {
				if (!isVisited[k]) {
					dfs(k, isVisited, arr);
					result++;
				}
			}
			System.out.println(result);
		}

	}

	public void dfs(int x, boolean[] isVisited, int[] arr) {
		isVisited[x] = true;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 == arr[x] && !isVisited[i]) {
				dfs(i, isVisited, arr);
			}
		}
	}

}
