import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("cb de n premiers termes de fibonnacci voulez");
		int n = scan.nextInt();
		System.out.println("les " + n + " premiers termes de la suite de fibonacci sont: " + Arrays.toString(fibo(n)));
		scan.close();
	}

	public static int[] fibo(int n) {

		int[] suite = new int[n];

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				suite[i] = i;
			}

			else {
				suite[i] = suite[i - 2] + suite[i - 1];
			}
		}
		return suite;
	}
}
