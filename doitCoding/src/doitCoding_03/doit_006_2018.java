package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_006_2018 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		int N = Integer.parseInt(st.nextToken());
		int sum[] = new int[N+1];
		int ans = 0;
		
		for(int i=1; i< N+1 ; i++) {
			sum[i] = sum[i-1] + i;
		}
		
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<N+1; j++) {
				if(j>i) {
					if(sum[j] - sum[i-1] == N) ans++;
				}
			}
		}
		
		System.out.println(ans+1);
		
	}	
}
