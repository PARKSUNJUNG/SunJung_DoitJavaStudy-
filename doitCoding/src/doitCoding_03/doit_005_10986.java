
package doitCoding_03;

import java.util.Scanner;

public class doit_005_10986 {

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N+1];
		int sum[] = new int[N+1];
		int ans[] = new int[N+1]; // 나머지 배열
		int num[] = new int[N+1]; 
		int answer = 0;
		
		for(int i=1; i<N+1; i++) {			
			arr[i] = sc.nextInt();
			sum[i] = arr[i] + sum[i-1];
			ans[i] = sum[i] % M;
			
			if(ans[i] == 0) answer++;	
			
			num[ans[i]]++;	
		}
		
		for(int i=0; i<M; i++) {
			if(num[i]>1) {
			answer += (num[i]*(num[i]-1))/2;

			}}
		
		System.out.println(answer);		

	}	
}
