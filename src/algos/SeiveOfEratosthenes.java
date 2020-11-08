package algos;

import java.util.Arrays;
import java.util.Scanner;

public class SeiveOfEratosthenes {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[] primes = seiveOfEratosthenes(n);
		
		for(boolean b: primes) {
			System.out.println(b);
		}
		
	}
	
	static boolean[] seiveOfEratosthenes(int n) {
		
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]= false;
		isPrime[1]=false;
		
		for(int i=2; i*i <n ; i++ ) { // i less than root n bcoz-> for any no. n if it is not prime it must have a devisor below root n & if it does not have that then it means it will never have it in numbers grater than root n too.
			if(isPrime[i]==true) {
				
				for(int j = 2*i; j<n; j=j+i) { // OPTIMIZATION -> j= i*i ( since all no. less than i*i will have a divisor below i and all nos. below i is already traversed.
					isPrime[j]=false;	
				}
			}
		}
		
		return isPrime;
	}
	
}
