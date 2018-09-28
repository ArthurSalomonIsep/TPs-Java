import java.util.Scanner;

public class Pavedroit {
	
	/**
	 * on demande a l'utilisateur de rentrer 3 flottants qui seront considérés comme
	 * la hauteur ,la longueur et la largeur du pavé
	 */
	public static void main(String[] args) {


		System.out.println("Quelle est la hauteur du pavé droit ?");
		Scanner scan = new Scanner(System.in);
		double doubleLu = scan.nextDouble();
		System.out.println("Quelle est la longueur du pavé droit ?");
		double doubleLu2 = scan.nextDouble();
		System.out.println("Quelle est la largeur du pavé droit ?");
		double doubleLu3 = scan.nextDouble();
		double volume = Math.abs(doubleLu * doubleLu2 * doubleLu3);




		System.out.println("Le pavé droit fait :" + volume + " de volume!");

	}

}
