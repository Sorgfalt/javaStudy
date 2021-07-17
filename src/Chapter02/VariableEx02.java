package Chapter02;

import java.util.Scanner;

public class VariableEx02 {
    public static void main(String[] args) {
        //상수를 이용하여 타입이 다른 값들을 더하고 문자를 입력받아 출력하는 프로그램
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.printf("첫번째 숫자를 입력해주세요 : ");
        String input1 = sc.nextLine();
        System.out.printf("두번째 숫자를 입력해주세요 : ");
        String input2 = sc.nextLine();

        int num1 = Integer.parseInt(input1);
        float num2 = Float.parseFloat(input2);
        int result = num1 *  (int)num2 * (int)PI;

        System.out.printf("문자를 입력해주세요 : ");
        String text1 = sc.nextLine();
        String text = text1;

        System.out.printf(text + result);
    }
}
