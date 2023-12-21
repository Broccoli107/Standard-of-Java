package 남궁성_12_04.Ex7_29;

public class Ex7_29 {
    public static void main(String[] args) {
        A a= new A();
        a.methodA();
    }

}

class A {
    void methodA (){
        I i =InstaceManager.getInstance(); //이렇게 해 놓으면  객체를 추가하거나 변경할때 InstanceManager에서 생성하는 객체 이름만 변경하면 된다.
        i.methodB();
        System.out.println( i.toString());
    }
}
 interface  I{
    public abstract void methodB();
 }


 class B implements I {
    public void methodB(){
        System.out.println( "methodB in B class");
    }
   public String toString (){
        return "class B";
   }
 }
 class InstaceManager {
    public static I getInstance() { // 반환타입이 인터페이스 이다. 고로 인터페이스를 구현한 객체를 반환 해야한다.
        return new B();// B b= new B(); return b;를 한문장으로 요약한것
     }
 }