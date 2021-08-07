package Chapter08;

import java.util.Scanner;

public class ExceptionHandling02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("숫자를 입력해주세요");
			square(sc.nextLine());
		}catch (NumberFormatException e){
			System.out.println("정수가 아닙니다");
		}
	}

	private static void square(String s) throws NumberFormatException{
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}
}
