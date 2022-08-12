package doitCoding_05;

import java.util.Scanner;

public class doit_024_2023 {
	
	public static int N=0;

 	public static void main(String[] args)  {
 		
 		Scanner sc = new Scanner(System.in);
 		
 		N = sc.nextInt();
 		
 		if(N == 1) {
 			System.out.println(2);
 			System.out.println(3);
 			System.out.println(5);
 			System.out.println(7);
 			
 		}
 		
 		DFS(2,1);
 		DFS(3,1);
 		DFS(5,1);
 		DFS(7,1);

	}
 	
 	static void DFS(int prime, int count) {
 		
 		if(count == N+1) return;
 		
 		prime = prime*10;
 		count++;
 		
 		for(int i=1; i<=9; i++) {
 			if(i%2 == 0) continue;
 			else {
	 			int primeNum = prime+i;
	 			boolean bl = numMethod(primeNum); 			
	 			if(bl == true) {
	 				if(count == N) System.out.println(primeNum);
	 				else {
	 					DFS(primeNum, count);
	 				}
	 			}
 			}
	
 		}
 	}
 	
 	static boolean numMethod(int num) {
 		
 		for(int i=2; i<=num/2; i++) {
 			if(num%i == 0) return false;
 		}
 		
 		return true;
 		
 	}
 		
}
