package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방법 1 (투포인터 사용 x)
public class doit_006_2018 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans=0;
		
		int s = 1;
		
		for(int i=1; i<=n; i++) {
			s=i;
			int sum = 0;
			while(sum<n) {
				sum += s;
				s++;
				if(sum == n) ans++;
			}
		}
		
		System.out.println(ans);
		
	}
	
}