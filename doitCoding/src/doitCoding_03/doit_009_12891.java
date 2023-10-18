package doitCoding_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 풀이 2 - 정답 공부
public class doit_009_12891 {
	
	static int[] num; // 조건 배열
	static int[] check; // 체크 배열
	static int checkNum;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		char[] ch = br.readLine().toCharArray();
		
		st = new StringTokenizer(br.readLine());
		num = new int[4];
		check = new int[4]; // 체크 배열
		checkNum = 0; // 4가 되었을 때, 조건 충족
		for(int i=0; i<4; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			// 문자가 0이면 굳이 체크를 안해도 되므로 미리 걸러내기
			if(num[i] == 0) checkNum++;
		}
		
		int ans = 0;
		
		// 초기 p 부분 처리
		for(int i=0; i<p; i++) {
			Add(ch[i]);
		}
		
		if(checkNum == 4) ans++;
		
		for(int i=p; i<s; i++) {
			int j=i-p;
			Add(ch[i]);
			Remove(ch[j]);
			
			if(checkNum == 4) ans++;
		}
		
		System.out.println(ans);
		br.close();	
		
	}
	
	// 새로 들어온 문자를 처리하는 함수 
	private static void Add(char c) {
		switch(c) {
		case 'A':
			check[0]++;
			if(num[0] == check[0]) checkNum++;
			break;
			
		case 'C':
			check[1]++;
			if(num[1] == check[1]) checkNum++;
			break;
			
		case 'G':
			check[2]++;
			if(num[2] == check[2]) checkNum++;
			break;
			
		case 'T':
			check[3]++;
			if(num[3] == check[3]) checkNum++;
			break;
		}
	}
	
	// 기존 문자를 처리하는 함수 
	private static void Remove(char c) {
		switch(c) {
		case 'A':			
			if(num[0] == check[0]) checkNum--;
			check[0]--;
			break;
			
		case 'C':
			if(num[1] == check[1]) checkNum--;
			check[1]--;
			break;
			
		case 'G':
			if(num[2] == check[2]) checkNum--;
			check[2]--;
			break;
			
		case 'T':
			if(num[3] == check[3]) checkNum--;
			check[3]--;
			break;
		}
	}
		
}