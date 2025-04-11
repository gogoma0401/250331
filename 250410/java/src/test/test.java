package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int row = 0;
		int [] column = new int[4];
		int sum = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
//		System.out.print("원하시는 행을 입력하세요");
		
		for(int i = 0; i<column.length; i++) {
			System.out.println((i+1) +"번째 숫자를 입력하세요");
			column[i] = sc.nextInt();
		}
		for(int i =0; i<column.length; i++) {
			sum += column[i];
		}
		avg += sum / column.length;
	}
}


