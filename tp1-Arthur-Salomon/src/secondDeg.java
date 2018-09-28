import java.util.Scanner;
public class secondDeg {

	public static void main(String[] args) {
		System.out.println("Quels est le coefficient devant le x² ?");
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		System.out.println("Quels est le coefficient devant le x ?");
		double b = scan.nextDouble();
		System.out.println("Quels est la constante ?");
		double c = scan.nextDouble();
		double delta = b*b-4*a*c;
		
		if(delta < 0) {
			System.out.println("Pas de solution");
		}
		
		if(delta == 0){
			double x0 = b/(2*a);
			System.out.println("la solution est " + x0);
		}	
		
		if(delta > 0) {
			double x1 = (b-Math.sqrt(delta))/(2*a);
			double x2 = (b+Math.sqrt(delta))/(2*a);	
			System.out.println("Les solutions de l'équation sont :" + x1 + "et" + x2);
		}		
		
	}

}
