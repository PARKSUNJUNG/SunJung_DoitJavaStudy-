package doitCoding_03;

import java.util.Scanner;

// 방법 2 (투포인터 사용 o)
public class doit_006_2018 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int start = 1;
		int end = 1;
		int ans = 1;
		int sum = 1;
		
		while(end != n) {
			if(sum == n) {
				ans++;
				end++;
				sum = sum + end;
			} else if(sum < n) {
				end++;
				sum = sum + end;
			} else { // sum > n
				sum = sum - start;
				start++;
			}
		}
		System.out.println(ans);
	}
	
}