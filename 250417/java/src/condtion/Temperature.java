package condtion;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("섭씨온도 1. 화씨온도 2.: ");
		int num = sc.nextInt();
		double sub = 0;
		double fa = 0;
		if(num == 1) {
			System.out.print("섭씨 온도 : ");
			sub = sc.nextDouble();
			fa = (sub*1.8) + 32;
			System.out.println("화씨 온도 : " + fa);
		}else if(num ==2) {
			System.out.print("섭씨 온도 : ");
			fa = sc.nextInt();
			sub = (fa - 32) / 1.8;
			System.out.println("섭씨 온도 : " + sub);
		}
		
		
	}
}
