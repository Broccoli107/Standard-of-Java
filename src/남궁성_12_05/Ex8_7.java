package 남궁성_12_05;

public class Ex8_7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {//예외가 발생할 블럭
            System.out.println(3);
            System.out.println( 0/0);//예외 발생 예외 객체 생성 후 catch문으로 이동
            System.out.println(4);
        }
        catch (ArithmeticException ae){ //예외 객체와 타입 일치 -> 실행
            System.out.println("true");
            System.out.println("ArithmeticException");;

        }
        catch ( Exception e){ //모든 예외의 조상 그래서 마지막에 작성
            System.out.println("Execption");
        }
        System.out.println(6);


    }

}
