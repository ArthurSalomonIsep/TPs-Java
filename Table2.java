
import java.util.Arrays;
import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(table()));

	}

	public static int[] table() {
		Scanner scan = new Scanner(System.in);
		System.out.println("De quel nombre voulez-vous la table ?");
		int a = scan.nextInt();
		System.out.println("De quelle taille sera la table ?");
		int taille = scan.nextInt();
		scan.close();
		int[] array = new int[taille+1];
		int[] unit = new int[taille+1];
		for (int i = 0; i < (taille+1); i++) {
			array[i] = (i * a);
			unit[i] = i;
		}
		System.out.println(Arrays.toString(unit));

		return array;

	}
}