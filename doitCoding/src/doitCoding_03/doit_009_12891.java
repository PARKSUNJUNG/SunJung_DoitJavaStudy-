package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 1 - 시간초과
public class doit_009_12891 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		char[] ch = str.toCharArray();
	
		int[] num = new int[4];
		int[] num2 = new int[4]; // 비교 배열
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0;
		int end = start + (p-1);
		int ans = 0;
		
		while(end < s){
			for(int i=start; i<=end; i++) {
				if(ch[i] == 'A') num2[0]++;
				else if(ch[i] == 'C') num2[1]++;
				else if(ch[i] == 'G') num2[2]++;
				else num2[3]++;
			}
			
			if(num[0] <= num2[0] && num[1] <= num2[1] && num[2] <= num2[2] && num[3] <= num2[3]) {
				ans++;
				start++;
				end++;
				num2[0]=0; num[1]=0; num2[2]=0; num2[3]=0;
			} else {
				start++;
				end++;
				num2[0]=0; num[1]=0; num2[2]=0; num2[3]=0;
			}
			
		}
		
		System.out.println(ans);
	}
		
}