package codeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;
import java.util.Arrays;

public class IronMagnet {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.valueOf(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			String nk = br.readLine();
			int n = Character.getNumericValue(nk.charAt(0));
			int k = Character.getNumericValue(nk.charAt(2));
			
			String ci = br.readLine();
			char[] arr = ci.toCharArray();
			
			
//			for (int j=0; j<n; j++) {		
//				System.out.println(arr[j]);
//			}
			
			printMagnet(arr,n, k);

		}
	}
	
	
	
	public static void printMagnet(char[] arr, int n, int k) {
		
		int megaScore= 0;
		
		boolean[] ironChecked = new boolean[n];
		
		Arrays.fill(ironChecked, false);
		
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]=='M') {
				
				for(int j = i; j<n; j++) {
					
					if(!(arr[j]=='X')) {
						
						int sheets=0;
						
						if(!(arr[j]==':')) {
							
							if((arr[j]=='I')) {
								
								if(calcScore(i,j,sheets, k)>0) {
									
									megaScore++;
									ironChecked[j]=true;
								}
								
							}
							
							
						}else {
							sheets++;
						}
						
						
					}else {
						break;
					}
				}
			}
		}
	
//		
//		System.out.println(megaScore);
		
		
		for(int i=n-1; i>=0; i--) {
			
			if(arr[i]=='M') {
				
				for(int j = i; j>=0; j--) {
					
					if(!(arr[j]=='X')) {
						
						int sheets=0;
						
						if(!(arr[j]==':')) {
							
							if((arr[j]=='I')) {
								
								if(ironChecked[n-j-1]==false) {
									if(calcScore(n-i-1,n-j-1,sheets, k)>0) {
										
										megaScore++;
									}
								}
							}
							
							
						}else {
							sheets++;
						}
						
						
					}else {
						break;
					}
				}
			}
		}
	
		
		
		System.out.println(megaScore);
	}

	public static int calcScore(int i, int j, int sheets, int k) {
		
		
		int power = k+1- Math.abs(j-i) - sheets;
		
//		K+1−|j−i|−S
		return power;	
	}
}
