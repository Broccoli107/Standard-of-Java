package 남궁성_12_07;

public class Ex_InterfaceTest {
    public static void main(String[] args) {
        A a = new A();                              //B b
        a.autoPlay(new B ());
    }
}

class A {
    void autoPlay (I i){ //매개변수가 인터페이스 i 그 뜻은 매개변수 구현한 객체 만 들어와라
        i.play();
    }
}
interface I{
    public abstract void play();
}

class B implements I {
    public void play (){
        System.out.println( "play in B class");
    }
}
class C implements I{
    public void play(){
        System.out.println( " play in C class");
    }
}