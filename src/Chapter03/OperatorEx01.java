package Chapter03;

import java.util.Scanner;

public class OperatorEx01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calculator 객체 생성
        calculator.init(); // calculator라는 변수를 초기화
    }
}

class Calculator { // Calculator 클래스를 만듬
    Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

    int result; // int형 result 생성

    int num1; //int형 num1 생성
    int num2; //int형 num2 생성

    public void init() { // int 메소드 생성
        int num; //int형 num 생성

        do {
            System.out.printf("1. 덧셈, 2. 뺄셈, 3. 곱셈, 4.나눗셈 5. 종료%n"); // 숫자 입력
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
                default:
            }
        } while (num != 5);
    }

    public void add() { // 1번을 누르면 add 메소드를 실행
        print1(); // print1 메소드 실행
        num1 = sc.nextInt(); // num1이라는 변수에 스캐너를 이용하여 값 대입
        print2(); // print2 메소드 실행
        num2 = sc.nextInt(); // num2이라는 변수에 스캐너를 이용하여 값 대입
        result = num1 + num2; // num1과 num2를 더한 값을 result라는 변수에 대입
        result(); // result 메소드 실행
    }

    public void sub() {
        print1();
        num1 = sc.nextInt();
        print2();
        num2 = sc.nextInt();
        result = num1 - num2;
        result();
    }

    public void mul() {
        print1();
        num1 = sc.nextInt();
        print2();
        num2 = sc.nextInt();
        result = num1 * num2;
        result();
    }

    public void div() {
        print1();
        num1 = sc.nextInt();
        print2();
        num2 = sc.nextInt();
        result = num1 / num2;
        result();
    }

    public void print1(){ //print1 메소드
        System.out.println("첫번째 숫자를 입력해주세요");
    }

    public void print2(){ // print2 메소드
        System.out.println("두번째 숫자를 입력해주세요");
    }

    public void result(){ // result 메소드
        System.out.println("결과는 " + result);
    }
}
