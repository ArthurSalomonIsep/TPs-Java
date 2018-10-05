import java.util.Scanner;

public class Tablemultiplication2 {

	public static void main(String[] args) {
		
	}

	public static int[] table() {
		Scanner scan = new Scanner(System.in);
		System.out.println("De quel nombre voules-vous la table ?");
		int a = scan.nextInt();
		System.out.println("De quelle taille sera la table ?");
		int taille = scan.nextInt();
		scan.close();
		int[] array = new int[taille];
		for (int i = 0; i < taille; i++) {
			array[i] = (i * a);
		}
		return array;

	}
}
