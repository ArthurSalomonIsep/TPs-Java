import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Comment tu t'appelles?");
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		
		System.out.println("tu t'appelles :" + test +"!");				

	}

}
