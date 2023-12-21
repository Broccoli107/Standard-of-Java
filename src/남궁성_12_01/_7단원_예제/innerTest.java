package 남궁성_12_01._7단원_예제;

class AAA {
int i;



    class BBB{//BBB는 AAA의 내부클래스

        void method(){
//            AAA a= new AAA(); //B 가 A의 내부클래스가 아니면 A의 객체생성 후 A의 i값을 불러야한다.
//            System.out.println(a.i);

            System.out.println(i);//객체 생성 없이 외부 클래스의 맴버 접근 가능
        }
    }


}

class CCC{

}


public class innerTest {
    public static void main(String[] args) {
        AAA a= new AAA();
        a.i=10;
        System.out.println();
    }
}
