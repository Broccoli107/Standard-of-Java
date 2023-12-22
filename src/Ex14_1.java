@FunctionalInterface  //이 에너테이션은 꼭 붙어주는게 좋다
 //왜냐하면 이 에너테이션의 역할은 함수형인터페이스로 선언해줘서
 //하나의 추상메서드만 들어갈수 있게 해줘서 에러가 안난다.
interface MyFunction {
    int max (int a, int b ); //여기에는 안썼지만 인터페이스는 무조건 public abstract
}

@FunctionalInterface
        interface function {
    void myMethod();
}




public class Ex14_1 {
    public Ex14_1() {
        super();
    }

    static void aMethod(function f){
        f.myMethod();
    }

    public static void main(String[] args) {
//        Myfunction f =new Myfunction() { //익명 클래스 (일회용 객체 이름이 없는거다 이름이 Myfunction인 객체가 아니라
//            @Override
//            public int max(int a, int b) { //오버라이딩은 범위를 좁게 바꾸지 못하기때문에 public을 붙여줘야한다.
//                //당연히 인터페이스를 구현하는 메서드들은 다 public 이다.
//                return a>b ?a :b;
//            }
//        };
//
//        System.out.println(f.max(10,7));
        //위 코드를 아래처럼 다룰 수있다.
        //람다식 (익명의 객체)를 다루기 위한 참조변수의 타입은 함수형 인터페이스이다.
        //함수형인터페이스는 왜 존재해야하는가
        MyFunction f = (a,b) -> a >b ?a :b;



        function f1 = ()-> System.out.println("aMethod 출력");

        aMethod(f1);

        }
}
