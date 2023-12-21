package 남궁성_12_01._7단원_예제;

//일단 인터페이스 안쓸때
class A{
    public void method( I i){//인터페이스에서 구현된 메서드만 들어온다는 의미
        i.method();
    }
}
interface I{
    public void method();
}

class B implements I{
    public void method(){
        System.out.println("B 클래스의 메서드");
    }
}
//인터페이스를 쓰지 않으면 클래스C의 메서드를 호출 할때 클래서 A도 변경해야한다.
//그런 변경을 줄이기 위해 인터페이스를 사용하는것이다. 변경이 자주일어나면 에러가 일어날 확률이 준다. 그래야 할 일이준다.
class C implements I {
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}
public  class InterfaceTest{
    public static void main(String[] args) {
        A a= new A();
        a.method(new B());
    }
}









