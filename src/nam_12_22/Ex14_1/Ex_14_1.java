package nam_12_22.Ex14_1;
@FunctionalInterface
interface Myfunction {
   void run();//public abstract void run()
}


public class Ex_14_1 {
    static Myfunction getMyFunction(){
  //반환타입이 인터페이스 ->람다식을 반환한다.
//        Myfunction f= ()-> System.out.println("f1.run()");
//        return f 이걸 한줄로
        return ()-> System.out.println("f1.run()");
    }
    //인터페이스에 정의된 추상메서드를 통해서 람다식을 부른다.
    static void excute(Myfunction f){
        f.run();
    }


    public static void main(String[] args) {



        Myfunction f1 = ()-> System.out.println("f1.run()"); //람다식으로 myFunction 을 구현
        Myfunction f2 =new Myfunction() {  //익명클래스 생성
            @Override
            public void run(){
                System.out.println( "f2.run() (그냥 익명클래스 객체생성으로 구현)");
            }
        };
        Myfunction f3= getMyFunction();


            f2.run();

            f3.run(); //f3에 받은 람다식을 호출할려면 Myfunction에 있는 추상메서드 호출
            excute(f1);
            excute(() -> System.out.println("run!!!" +"(람다식을 그냥 메서드안에 집어넣기)"));

        }
}
