package Chapter06.PrjMng.productMng;

import java.util.*;

public class PrjMng {
    public static void main(String[] args) {
        PrjCrud prjCrud = new PrjCrud();
        prjCrud.init();
    }
}

class PrjCrud {
    Scanner input = new Scanner(System.in);
    //menuName란 변수를 ArrayList에 담음
    ArrayList menuName = new ArrayList();
    //menuPrice란 변수를 ArrayList에 담음
    ArrayList menuPrice = new ArrayList();

    // 생성자 생성
    public PrjCrud() {

    }

    // init 생성
    public void init() {
        int num;

        do {
            System.out.println("1. 상품 등록, 2. 상품 조회 , 3. 상품 수정, 4. 상품 삭제");
            num = input.nextInt();
            switch (num) {
                case 1:
                    prdCreate();
                    break;
                case 2:
                    prdRead();
                    break;
                case 3:
                    prdUpdate();
                    break;
                case 4:
                    prdDelete();
                    break;
            }
        } while (num != 4);
    }

    public void prdCreate() {
        System.out.println("상품명을 입력해주세요");
        //next() - 문자 또는 문자열을 공백을 기준으로 한단어 또는 한문자씩 입력
        //input로 한문자씩 입력 받은 값을 menuName에 추가
        menuName.add(input.next());
        System.out.println("가격을 입력해주세요");
        //input로 한문자씩 입력 받은 값을 menuPrice 추가 (int)
        menuPrice.add(input.next());
    }

    public void prdRead() {
        //temp 0으로 초기화
        int temp = 0;
        System.out.println("검색할 상품명을 입력해주세요");
        String str = input.next();
        //indexOf 문자열에 특정 단어가 있는지를 찾고 있을 경우 위치값을 리턴
        //str에 상품명을 입력한 값이 들어 있고 그 값을 indexOf로 통해 위차 값 리턴
        temp = menuName.indexOf(str);
        if (temp == 1) {
            System.out.println("검색 목록에 조회되지 않습니다");
        } else {
            System.out.println("검색된 상품입니다");
            System.out.println(menuName.get(temp) + "\t");
            System.out.println(menuPrice.get(temp) + "원" + "\t");
        }
    }

    public void prdUpdate() {
        String name = " ", str = " ";
        int temp = 0, num = 0;
        System.out.println("수정하고 싶은 상품명을 입력해주세요");
        name = input.nextLine();
        temp = menuName.indexOf(name);
        if (temp == -1) {
            System.out.println("상품명을 찾을 수 없습니다");
        } else {
            System.out.println("수정하실 부분을 선택해주세요 1. 상품명, 2. 가격");
            num = input.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("변경하실 상품명을 입력해주세요");
                    input.nextLine();
                    str = input.nextLine();
                    menuName.set(temp, str);
                    System.out.println("변경되었습니다");
                    break;
                }
                case 2: {
                    System.out.println("변경하실 가격을 입력해주세요");
                    input.nextLine();
                    str = input.nextLine();
                    menuPrice.set(temp, str);
                    System.out.println("변경되었습니다");
                    break;
                }
            }
            System.out.println(menuName.get(temp) + "\t");
            System.out.println(menuPrice.get(temp) + "원" + "\t");
        }
    }

    public void prdDelete() {
        int temp = 0;
        System.out.println("삭제하실 상품명을 입력해주세요");
        String str = input.nextLine();
        temp = menuName.indexOf(str);
        if (temp == -1) {
            System.out.println("검색 목록에서 조회되지 않았습니다");
        } else {
            menuName.remove(temp);
            menuPrice.remove(temp);
        }
    }
}
