
public class Recherche {

	public static void main(String[] args) {
		
		 int [] tab1 = {1,2,3,4,5};
		 int [] tab2 = {1,2,3,4,5};
		 int [] tab3 = {9,8,7,6,5,4,3,2,1,0};
		 int [] tab4 = {9,8,7,6,5,4,3,2,1,0};

		System.out.println(recherche(55,tab1));
		System.out.println(recherche(5,tab2));
		System.out.println(recherche(9,tab3));
		System.out.println(recherche(5,tab4));
		
		
		
		
	}

	public static int recherche(int val, int[] tab) {
		int r = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == val) {
				r = i;
				break;
			}
		}
		return r;
	}

}
