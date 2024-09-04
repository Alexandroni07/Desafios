package Fibonacci;

import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		
		if(FiboCheck(n) == 1) {
			System.out.println("O número " + n + " pertence a sequência de Fibonacci");
		} else {
			System.out.println("O número " + n + " Não pertence a sequência de Fibonacci");
		}
		sc.close();
	}
	
	public static int FiboCheck(int n) {
		
        if (n == 0 || n == 1) {
            return 1;
        }

        int init = 0, x = 1;
        while (x < n) {
            int temp = x;
            x += init;
            init = temp;
        }
        if(x < n || x > n) {
        return 0;
        } else {
        	return 1;
        }
    }
}


