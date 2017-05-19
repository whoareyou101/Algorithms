import java.util.Scanner;

//¹®ÀÚ¿­ Ã³¸®
//Question number 10942(ÆÓ¸°µå·Ò?)
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.palindrome();
		
	}
	
		public void palindrome() {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			int[] arr = new int[n];
			// set arr
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int q_num = sc.nextInt();
			for (int j = 0; j < q_num; j++) {
				int S = sc.nextInt()-1;
				int E = sc.nextInt()-1;
				if (isRight(S, E, arr)) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}

		public boolean isRight(int s, int e, int[] arr) {
			boolean result = true;

			// Â¦¼ö
			if ((e - s) % 2 == 0) {
				int mid = (e + s) / 2;
				for (int i = 1; i <= mid - s; i++) {
					if (arr[mid - i] != arr[mid + i]) {
						return false;
					}
				}

			} else {
				// È¦¼ö
				int mid = (e + s) / 2;
				for (int i = 0; i < e - mid; i++) {
					if(arr[mid-i] != arr[mid +i+1]){
							return false;
					}
				}
			}

			return result;
		}
}
