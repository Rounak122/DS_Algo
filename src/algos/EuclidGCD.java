package algos;

import java.util.Scanner;

public class EuclidGCD {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		int b = sc.nextInt();
		
		int gcdNumber = gcd(a,b);
		
		System.out.println(gcdNumber);
		
	}
	
	static int gcd(int a, int b) {
		
		if (b==0)
			return a;
		
		return gcd(b, a%b);
		
	}
	
}
