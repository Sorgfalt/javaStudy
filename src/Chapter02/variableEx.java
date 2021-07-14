package Chapter02;

import java.util.*;

public class variableEx {
    public static void main(String[] args) {
        //숫자를 입력하여 타입이 다른 변수를 형변환하여 두 값을 더하는 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수형 값을 입력해주세요");
        String input = sc.nextLine();
        System.out.printf("실수형 값을 입력해주세요");
        String input2 = sc.nextLine();

        int num = Integer.parseInt(input);
        double num2 = Double.parseDouble(input2);
        int result = num + (int) num2;

        System.out.println("입력내용 : " + result);
        System.out.printf("num=%d%n", result);
    }
}
