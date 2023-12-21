package 남궁성_12_05;

public class Ex8_8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println( 0/0);//예외 발생->예외객체생성->catch 문으로 이동
            System.out.println(4);
        }catch (ArithmeticException ae){
            ae.printStackTrace();// 예외의 정보를 준다.
            System.out.println( "예외메세지"+ ae.getMessage());// 예외 객체의 저장된 메서지
        }
        System.out.println(6);
    }
}


