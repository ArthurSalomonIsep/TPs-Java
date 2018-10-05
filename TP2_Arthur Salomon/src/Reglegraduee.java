import java.util.Scanner;

public class Reglegraduee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quelle est le nombre de graduation de la règle ?");
		int a = scan.nextInt();
		System.out.println("Quel est l'intervalle ?");
		int b = scan.nextInt();
		scan.close();
		for (int i = 0; i < (a + 1); i++) {
			if (i % b == 0) {
				System.out.print("|");
			} else {
				System.out.print("-");
			}

		}
	}
}
