import java.util.Scanner;

public class Puissance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("quel est le nombre a ?");
		double a = scan.nextDouble();
		System.out.println("A quelle puissance le multiplier ?");
		int n = scan.nextInt();
		scan.close();
		if (n==0) {
			a=1.0;
		}
		else for (int i = 1; i < n; i++) {
			a *= a;
		}
		System.out.println("a^n = " + a);
	}

}
