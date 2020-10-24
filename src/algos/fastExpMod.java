package algos;

import java.util.Scanner;

public class fastExpMod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		sc.nextLine();
		long b = sc.nextLong();
		sc.hasNextLine();
		long m = sc.nextLong();
		
//		long expNumber = fastExp(a,b);
		long expMod = fastExpMod(a,b,m);
		
		System.out.println(expMod);
		
	}
	
	
	static long fastExp(long a, long b){
		
		long res = 1;
		
		while (b>0) {
			
			if((b&1)==1) {		// if rightmost bit == 1
				res = res*a;    // add that time value of a to res
			}
			b =b>>1;			//right shift b to make new rightmost value
			a=a*a;				// square a for every iteration
		}
		
		return res;
	}
	
	static long fastExpMod(long a, long b, long m){
		
		long res = 1;
		
		while (b>0) {
			
			if((b&1)==1) {		// if rightmost bit == 1
				res = (res*a)%m;    // add that time value of a to res
			}
			b =b>>1;			//right shift b to make new rightmost value
			a=(a*a)%m;				// square a for every iteration
		}
		
		return res;
	}
	

}
