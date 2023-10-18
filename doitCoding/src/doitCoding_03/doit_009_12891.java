package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 3 - 정답 스스로 풀어보기_90% 풀었음_복습 필요
public class doit_009_12891 {
	
	static int[] num;
	static int[] check;
	static int finish=0; // 최소조건인 4가 충족되면 비밀번호로 사용할 수 있다.
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		char[] ch = br.readLine().toCharArray();
		num = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			if(num[i]==0) finish++;
		}
		
		check = new int[4]; // 비교 배열
		for(int i=0; i<p; i++) {
			Add(ch[i]);
		}
		
		int ans=0;
		if(finish == 4) ans++;
		
		for(int i=p;i<s;i++) {
			Add(ch[i]);
			Remove(ch[i-p]);		
			if(finish == 4) ans++;
		}
		
		System.out.println(ans);
	}	
	
	private static void Add(char c) {		
		switch(c) {
			case 'A':
				check[0]++;
				if(num[0]==check[0]) finish++;
				break;
			case 'C':
				check[1]++;
				if(num[1]==check[1]) finish++;
				break;
			case 'G':
				check[2]++;
				if(num[2]==check[2]) finish++;
				break;
			case 'T':
				check[3]++;
				if(num[3]==check[3]) finish++;
				break;
		}
				
	}
	
	private static void Remove(char c) {		
		switch(c) {
			case 'A':
				if(num[0]==check[0]) finish--;
				check[0]--;
				break;
			case 'C':
				if(num[1]==check[1]) finish--;
				check[1]--;
				break;
			case 'G':
				if(num[2]==check[2]) finish--;
				check[2]--;
				break;
			case 'T':
				if(num[3]==check[3]) finish--;
				check[3]--;
				break;
		}
				
	}
}