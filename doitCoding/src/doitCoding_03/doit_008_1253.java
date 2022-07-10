package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_008_1253 { // 시간 초과 // 테케는 맞아서 답인지 확신하지 못함

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int num[] = new int[N];
		int start = 0;
		int end = 1;
		int sum = 0;
		int ans = 0;
				
		st = new StringTokenizer(br.readLine());
		for(int i=0; i< N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		while(start != N-1) {
			sum = 0;
			for(int i=0; i<N; i++) {
				sum = arr[start] + arr[end];
				
				if(sum == arr[i]){
					if(num[i] > 0) {
						num[i]++;
					}
					else {
						num[i]++;
						ans++;
						break;
					}
				}
			}
			end++;
			
			if(end == N) {
				start++;
				end= start+1;
			}			
		}
		
		System.out.println(ans);

	}
}
