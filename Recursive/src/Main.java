import java.util.Scanner;

//Dynamic Programming - Memoization
//Question number 9184(신나는 재귀호출)
public class Main {
	boolean flag;
	private static int[][][] buf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.recursive();
	}

	public void recursive() {
		Scanner sc = new Scanner(System.in);
		int a, b, c, result;
		buf = new int[21][21][21];

		while (true) {

			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			// end input
			if (a == -1 && b == -1 && c == -1)
				break;

			result = w(a, b, c);

			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + result);
		}

	}

	public int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			buf[0][0][0] = 1;
			return buf[0][0][0];

		} else if (a > 20 || b > 20 || c > 20) {
			return w(20, 20, 20);

		} else if (a < b && b < c) {
			if (buf[a][b][c] != 0) {
				return buf[a][b][c];
			} else {
				buf[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
				return buf[a][b][c];
			}

		} else {
			if (buf[a][b][c] != 0) {
				return buf[a][b][c];
			} else {
				buf[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
				return buf[a][b][c];
			}

		}
	}
}
