import java.util.Scanner;

public class Tablemultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("taille de la table ?");
		int a = scan.nextInt();
		int x = 1;
		scan.close();
		for (int j = 0; j < a; j++) {
			for (int i = x; i < ((a * x)+x); i += x) {
				System.out.print(i + " ");
			}
			x++;
			System.out.print("\n");
		}
		

	}
}
