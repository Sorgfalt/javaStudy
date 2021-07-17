package Chapter04;

import java.util.Scanner;

public class ControlStatementEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("출력하실 단을 입력해주세요 %n");
        String input1 = sc.nextLine();
        int num = Integer.parseInt(input1);
        for (int i = num; i >= 1; i--) {
            for (int j = 9; j >= 1; j--) {
                System.out.printf("%d * %d = %d %n", i, j, i * j);
            }
        }
    }
}
