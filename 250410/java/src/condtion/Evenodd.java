package condtion;
import java.util.Scanner;
public class Evenodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = sc.nextInt();
		if (num % 2 == 0 ) {
			System.out.println(num + "은 짝수 입니다.");
		}else {
			System.out.println(num + "은 홀수 입니다.");
		}
	}
}
