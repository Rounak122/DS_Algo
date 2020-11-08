package codeChef;

import java.io.*;
import java.util.*;

public class AdaAndDishes {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.valueOf(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			int n = Integer.valueOf(br.readLine());
			int[] arr = new int[n];
			
			String[] ci = br.readLine().trim().split(" ");
			
			for (int j=0; j<n; j++) {		
				arr[j]=Integer.parseInt(ci[j]);
			}
			
			computeTime(arr);
			
		}
	}
	
	
	
	public static void computeTime(int[] arr) {
		
	if (arr.length == 1)
		System.out.print(arr[0]);
	
	if(arr.length == 2)
		System.out.print(arr[0]>arr[1]?arr[0]:arr[1]);
		
	if(arr.length == 3) {
		Arrays.sort(arr);
		
		int a = arr[2];
		int b = arr[0] + arr[1];
		System.out.print(a>=b?a:b);
	}
	
	if(arr.length == 4) {
		
		Arrays.sort(arr);
		
		int a = arr[3]+ arr[0];
		int b = arr[1] + arr[2];
		System.out.print(a>=b?a:b);
	}		
	}

}
