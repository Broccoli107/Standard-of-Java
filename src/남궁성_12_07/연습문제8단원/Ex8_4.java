package 남궁성_12_07.연습문제8단원;

public class Ex8_4 {
    static void method (boolean b){
        try{
            System.out.println(1);
            if(b) throw new ArithmeticException();
            System.out.println(2);
        }catch (RuntimeException r){
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
        }finally {
            System.out.println(5);
        }
        System.out.println(6);

    }

    public static void main(String[] args) {
        method(true);
    }



}
