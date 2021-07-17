package Chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 %n");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String num3 = sc.nextLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        int[] iArr = new int[] {a,b,c};
        System.out.printf(Arrays.toString(iArr));
    }
}
