package Chapter03;

import java.util.Scanner;

public class operator01 {
    public static void main(String[] args) {
        //계산기 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. 덧셈, 2. 뺄셈, 3. 곱셈, 4.나눗셈, 5.나머지 %n");
        System.out.printf("번호를 입력해주세요 %n");
        String num = sc.nextLine();
        System.out.printf("첫번째 숫자를 입력해주세요 %n");
        String input1 = sc.nextLine();
        System.out.printf("두번째 숫자를 입력해주세요 %n");
        String input2 = sc.nextLine();
        Integer result;
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        if (num.equals("1")){
             result = num1 + num2;
            System.out.printf("결과 값 : " + result);
        }else if(num.equals("2")){
            result = num1 - num2;
            System.out.printf("결과 값 : " + result);
        }else if(num.equals("3")){
            result = num1 * num2;
            System.out.printf("결과 값 : " + result);
        }else if (num.equals("4")){
            result = num1 / num2;
            System.out.printf("결과 값 : " + result);
        }else if(num.equals("5")){
            result = num1 % num2;
            System.out.printf("결과 값 : " + result);
        }else{
            System.out.printf("잘 못 입력하셨습니다");
        }


    }
}
