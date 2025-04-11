package loop;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하세요 : ");
		int num = sc.nextInt();
		
		int odd = 0;
		int even = 0;
		long start = System.currentTimeMillis();
		System.out.println("start :" + start);
		for(int i = 0; i<=num; i++) {
			if(i % 2 != 0) {
				odd +=i;
			}else{
				even +=i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("홀수 합계 :" + odd);
		System.out.println("짝수 합계 :" + even);
		System.out.println("실행시간:" + (end - start));
	}
}
