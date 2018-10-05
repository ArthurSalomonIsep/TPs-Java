import java.util.Scanner;

public class Nombrepremier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("quel est le nombre à tester ?");
		int a = scan.nextInt();
		scan.close();
		boolean nbpremier = isPrimeNumber(a);

		if (nbpremier) {
			System.out.println(a + " est un nombre premier divisible par 1 et lui-même !");
		} else {			
			System.out.println(a + " n'est pas un nombre premier");
		}
	}
	
	public static boolean isPrimeNumber(int a) {
		if (a == 1 || a == 0) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;

			}
		}
		return true;
		
		
	}
	
}
