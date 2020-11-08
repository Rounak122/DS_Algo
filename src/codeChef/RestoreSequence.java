package codeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class RestoreSequence {

	static int primeUpto = 100000001;
	static boolean[] primes = new boolean[primeUpto];
	
	
	public static void main(String[] args) throws Exception {
		
		createPrimeNos();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.valueOf(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			int n = Integer.valueOf(br.readLine());
			
			int[] arr = new int[n];
			
			String[] ci = br.readLine().trim().split(" ");
			
			for (int j=0; j<n; j++) {		
				arr[j]=Integer.parseInt(ci[j]);
			}
			
			printSequence(arr , n);
			
			
		}

	}

	
	public static void createPrimeNos() {
		
		Arrays.fill(primes, true);
		
		primes[0]=false;
		primes[1]=false;
		
		for(int i = 2; i*i < primeUpto; i++) {
			if(primes[i]==true) {
					for (int j = 2*i; j<primeUpto; j = j+i) {
					primes[j]= false;
					}
			}
		}
	
	
	}
	
	
	public static void printSequence(int[] arr, int n){
		
		int[] seqA = new int[n];
		
		int count = 0;
		int p = 2;
		
		while(count<n) {
			
			if(primes[p]==true) {
				seqA[count]=p;
				count++;
			}
			
			p++;
			
		}
		
		

		for(int i = 0; i<n; i++) {
			
			if(arr[i]!= i+1) {
				
				seqA[i]=seqA[arr[i]-1];
			}
			
		}	
		
		

		for(int i = 0; i<n; i++) {
			
			System.out.println(seqA[i]); 
			
		}
			
	}
	
	
}
