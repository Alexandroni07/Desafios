package somaQst3;

import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 int INDICE = 12, SOMA = 0, K = 1;
		 
		 while(K < INDICE) {
			 K += 1;
			 SOMA += K;
		 }
		
		 System.out.println(SOMA);
		
		
		sc.close();
	}
}
