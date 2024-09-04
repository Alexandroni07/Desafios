package letraA;

import java.util.Locale;
import java.util.Scanner;

public class letraA {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma palavra qualquer sem espaços: ");
		String x = sc.nextLine();
		
		int qtd = 0;
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == 'a' || c == 'A') {
                qtd++;
            }
        }
        
        if(qtd > 0) {
        	System.out.println("A letra 'A' se encontra " + qtd + " vez(es) na palavra " + x );
        } else {
        	System.out.println("A letra 'A' não se encontra na palavra " + x );
        }
		
		
		
		
		sc.close();
	}
}
