package Chapter04;

import java.util.Scanner;

public class ControlStatementEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력해주세요 %n");
        String input = sc.nextLine();
        Integer num = Integer.parseInt(input);
       for (int i = 0; i < num; i++ ){
           for (int j = 0; j < num-i; j++){
               System.out.print(" ");
           }
           for (int y = 0; y < i*2+1; y++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
