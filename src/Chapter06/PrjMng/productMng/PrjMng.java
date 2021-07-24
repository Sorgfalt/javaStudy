package Chapter06.PrjMng.productMng;

import java.util.*;

public class PrjMng{
    public static void main(String[] args) {
        PrjCrud prjCrud = new PrjCrud();
        Scanner sc = new Scanner(System.in);
        System.out.println("1번을 누르시면 프로그램이 초기화됩니다");
        int num = sc.nextInt();
        switch (num){

            case 1 : prjCrud.init();
            break;
        }
    }
}

class PrjCrud {
    Scanner input = new Scanner(System.in);
    ArrayList menuName = new ArrayList();
    ArrayList menuPrice = new ArrayList();

    public PrjCrud() {

    }// 생성자 생성

    // 초기화
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
        menuName.add(input.next());
        System.out.println("가격을 입력해주세요");
        menuPrice.add(input.next());
    }
    public void prdRead(){
        int temp = 0;
        System.out.println("검색할 상품명을 입력해주세요");
        String str = input.next();
        temp = menuName.indexOf(str);
        if (temp == 1){
            System.out.println("검색 목록에 조회되지 않습니다");
        }else {
            System.out.println("검색된 상품입니다");
            System.out.println(menuName.get(temp) + "\t");
            System.out.println(menuPrice.get(temp) + "원" + "\t");
        }
    }
    public void prdUpdate(){
        String name = " ", str = " ";
        int temp = 0, num = 0;
        System.out.println("수정하고 싶은 상품명을 입력해주세요");
        input.nextLine();
        name = input.nextLine();
        temp = menuName.indexOf(menuName);
        if (temp == -1) {
            System.out.println("상품명을 찾을 수 없습니다");
        }else{
            System.out.println("수정하실 부분을 선택해주세요 1. 상품명, 2. 가격");
            num = input.nextInt();
            switch (num){
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
    public void prdDelete(){
        int temp = 0;
        System.out.println("삭제하실 상품명을 입력해주세요");
        String str = input.nextLine();
        temp = menuName.indexOf(str);
        if (temp == -1){
            System.out.println("검색 목록에서 조회되지 않았습니다");
        }else{
            menuName.remove(temp);
            menuPrice.remove(temp);
        }
    }
}
