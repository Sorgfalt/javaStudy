package Chapter03;

import java.util.Scanner;

public class OperatorEx01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.init();

    }
}

class Calculator {
    Scanner sc = new Scanner(System.in);
    int result;

    public Calculator() {

    }

    public void init() {
        int num;

        do {
            System.out.printf("1. 덧셈, 2. 뺄셈, 3. 곱셈, 4.나눗셈 5. 종료%n");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    break;
            }
        } while (num != 5);
    }

    public void add() {
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("결과는 " + result);
    }

    public void sub() {
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        result = num1 - num2;
        System.out.println("결과는 " + result);
    }

    public void mul() {
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        result = num1 * num2;
        System.out.println("결과는 " + result);
    }

    public void div() {
        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();
        result = num1 / num2;
        System.out.println("결과는 " + result);
    }
}
