package Chapter03;

import java.util.Scanner;

public class OperatorEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 %n");
        String input1 = sc.nextLine();
        Integer number1 = Integer.parseInt(input1);
        int i = 4;

        if (i == number1){
            System.out.printf("입력하신 값이 일치합니다");
        }else{
            System.out.printf("입력하신 값이 일치하지 않습니다");
        }
    }
}
