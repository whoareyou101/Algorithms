import java.util.Scanner;

public class LCS {
	public LCS(){
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		
		str1 = sc.next();
		str2 = sc.next();
		int N = str1.length(), M = str2.length();
		int lcs[][] = new int[N+1][M+1];
		
		//initialized 0
		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++){
				if(str1.charAt(i-1)==str2.charAt(j-1)){
					lcs[i][j] = lcs[i-1][j-1]+1;
				}else{
					lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
				}
				System.out.print(lcs[i][j] +  " ");
					
			}
			System.out.println();
		}

		//print result - LCS
		System.out.println(lcs[N][M]);
	}

}
