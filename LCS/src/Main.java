import java.util.Scanner;

//Dynamic Programming - LCS
//Question number 9251(LCS)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.LCS();
	}

	public void LCS() {
		String str1, str2;
		Scanner sc = new Scanner(System.in);

		str1 = sc.next();
		str2 = sc.next();
		int N = str1.length(), M = str2.length();
		int lcs[][] = new int[N + 1][M + 1];
		String str[][] = new String[N + 1][M + 1];

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				str[i][j] = "";
			}
		}

		
		// initialized 0
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
					str[i][j] = str[i-1][j-1] + str1.charAt(i - 1);
				} else {
					if (lcs[i][j - 1] >= lcs[i - 1][j]) {
						str[i][j] = str[i][j - 1];
					} else {
						str[i][j] = str[i - 1][j];
					}

					lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
				}
				System.out.print(lcs[i][j] + " ");
			}
			
			System.out.println();
		}

		// print result - LCS
		System.out.println(lcs[N][M] + " : " + str[N][M]);
	}

}
