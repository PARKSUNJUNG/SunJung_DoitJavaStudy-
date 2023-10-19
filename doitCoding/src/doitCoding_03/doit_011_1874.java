package doitCoding_03;

import java.util.Scanner;
import java.util.Stack;

// ㅊ
public class doit_011_1874 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();
		int num=1; // 오름차순의 시작 수
		for(int i=0; i<n; i++) {
			if(arr[i] >= num) {
				while(arr[i] >= num) {
					stack.push(num++);		
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int top = stack.peek();
				if(top>arr[i]) {
					System.out.println("NO");
					return;
				}
				stack.pop();	
				sb.append("-\n");
			}
		}
		System.out.println(sb.toString());
		
	}
	
}