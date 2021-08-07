package Chapter08;

public class ExceptionHandling {
    public static void main(String[] args) {
        int x, sum;
        try{
            x = Integer.parseInt(args[0]);
                sum = x / 0 ;
        }catch (ArithmeticException e){
            System.out.println("0으로 나누어서 예외발생");
        }catch (Exception e){
            System.out.println("args[0]를 주지않아 예외발생");
        }
    }
}
