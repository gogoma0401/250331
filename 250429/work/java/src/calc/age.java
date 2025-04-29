package calc;
import java.util.Scanner;

public class age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("출생연도:");
		int year = sc.nextInt();
		int age = 2024 - year;
		System.out.println(name +"의 나이는 만" + age + "세입니다.");
		if(year%2==0) {
			System.out.println("건강검진 대상입니다.");
		}else {
			System.out.println("비대상 입니다.");
		}
	}
	
}
