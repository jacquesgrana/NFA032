import java.util.Random;

public class TableauAleatoire_Exo1 {
	public static void main(String[] args) {
		int[] tab = new int[5];
		char c;
		int i,k;
		for(i = 0; i < 5; i++) {
			Random alea = new Random();
			tab[i]=alea.nextInt();
		}

		System.out.print("Voulez vous connaître une valeur du tableau (O/N) ?");
		c = Lire.c();
		while(c == 'O') {
			System.out.print("Donnez le rang qui vous intéresse : ");
			k = Lire.i();
			try {
				
				System.out.println("Le nombre au rang " + k + " vaut : " + tab[k]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Rang incorrect [0-4]");
			}
			
			System.out.print("Voulez vous connaitre une valeur du tableau (O/N) ?");
			c = Lire.c(); 
		} 
	}

}
