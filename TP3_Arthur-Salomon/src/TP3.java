
import javax.swing.JOptionPane;
import java.util.Scanner;

public class TP3 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Tp_3 par Arthur SALOMON", "G5C", JOptionPane.INFORMATION_MESSAGE);

		Menu();
	}

	public static String Menu() {

		System.out.println("Quel exercice ? Saisissez :");
		System.out.println("   1. Pour les réponses aux questions.");
		System.out.println("   2. Pour la fonction factorielle.");
		System.out.println("   3. Pour le calcul de PGCD.");
		System.out.println("   4. Pour les fonctions de temps");
		System.out.println("   5. Pour les palindromes");

		Scanner scan = new Scanner(System.in);
		int ans = scan.nextInt();

		if (ans == 1) {
			System.out.println("de quelle question voulez-vous la réponse ?");
			String ans2 = scan.next();
			if (ans2.equals("1")) {
				scan.close();
				return answer(1);
			}
		} else if (ans == 2) {
			System.out.println("quel est n dans n! ?");
			long n = scan.nextLong();
			System.out.println("   4. Pour les fonctions de temps");
			return (n + "! = " + factorielle(n));
		} else if (ans == 3) {
			System.out.println("a et b dans PGCD(a,b) ?");
			int a = scan.nextInt();
			int b = scan.nextInt();
			scan.close();
			return ("PGCD(" + a + "," + b + ")= " + PGCD(a, b));
		} else if (ans == 4) {
			System.out.println(answer(3));
		} else if (ans==5) {
			System.out.println(answer(4));
		}
		scan.close();
		return "Ce n'est pas une réponse possible !";
	}

	public static String answer(int x) {
		if (x == 1) {
			return "La fonction renvoie la factorielle d'un entier elle fait n!";
		} else if (x == 2) {
			return "La fonction PGCD est la réponse a la question";
		} else if (x == 3) {
			float[] taba = { 1.3f, 2.2f, 5.0f, 1.4f, 1.4f };
			float[] tabb = { 2.2f, 1.3f, 3.1f };
			boolean a = wasSafe(taba, 3.1f);
			boolean b = wasSafe(tabb, 10.1f);
			System.out.println(
					"Ces fonctions nous donnent si oui ou non le temps donné n'est pas le plus grand exemple pour la tab a :"
							+ a + "  ou pour la tab b :" + b);
			return ("Pour la version non récursive nous trouvons : " + wasSafenr(taba, 3.1f) + " pour la tab a et "
					+ wasSafenr(tabb, 10.1f) + " pour la tab b");

		} else if (x==4) {
			return(" la fonction récursive se fait avec deux pointeur un a gauche et un a droite, fonction a faire");
		}
		return "";
	}

	public static long factorielle(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorielle(n - 1);
		}
	}

	public static int PGCD(int a, int b) {

		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else if (a > b) {
			return PGCD(a - b, b);
		} else if (a < b) {
			return PGCD(a, b - a);
		} else {
			return a;
		}
	}

	public static boolean wasSafe(float[] temps, float tempMax) {
		return wasSafeR(temps, tempMax, temps.length - 1);
	}

	public static boolean wasSafeR(float[] temps, float tempMax, int pos) {
		boolean safe = tempMax < temps[pos];
		if (pos == 0 || safe) {
			return safe;
		}
		return wasSafeR(temps, tempMax, pos - 1);
	}

	public static boolean wasSafenr(float[] temps, float tempMax) {
		boolean answer = false;
		for (int i = 0; i <= temps.length - 1; i++) {
			if (tempMax < temps[i]) {
				answer = true;
				break;
			} else {
				answer = false;
			}
		}
		return answer;
	}
}
