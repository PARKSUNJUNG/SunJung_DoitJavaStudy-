package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_005_10986 {  // 백준에서 메모리 초과함

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long arr[] = new long[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum[][] = new long[N+1][N+1];
		long num = 0;
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<N+1; j++) {
				if(i == j) {
					sum[i][j] += arr[j];
				} else {
					sum[i][j] += arr[j]+ sum[i][j-1];
				}
				
				if(i<=j) {
					if((sum[i][j] % M)==0) {
						num++;
					} 
				}
			}
		}
		
		System.out.println(num);

	}	
}
