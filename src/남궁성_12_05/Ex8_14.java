package 남궁성_12_05;

public class Ex8_14 {
    public static void main(String[] args) {
        try {
            method1();//Exception 예외를 처리해 주기
        }catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception //2.Exception 예외가 있다는걸 호출한 쪽에게 알리기
     {
        throw new Exception(); //1.Exception 예외 발생 시키기
    }



}
