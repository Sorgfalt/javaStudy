package Chapter05;

import java.util.Scanner;

public class ArrayEx02 {
    public static <Scanner> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("문자를 입력해주세요123 %n");
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String text3 = sc.nextLine();

        String[] text = {text1, text2, text3};

        for (int i = 0; i < text.length; i++){
            System.out.println("text ["+i+"]:"+ text[i]);
        }
    }
}
