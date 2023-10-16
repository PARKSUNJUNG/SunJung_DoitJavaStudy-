package doitCoding_03;

import java.util.Scanner;

public class doit_001_11720 {
	
	public static void main(String[] args) {
		// 숫자의 합 구하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String number = sc.next();
		
		char[] num = number.toCharArray();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += num[i] - '0';
		}
		
		System.out.println(sum);		
	}
	
}
