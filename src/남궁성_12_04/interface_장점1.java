package 남궁성_12_04;

public class interface_장점1 {
    public static void main(String[] args) {
        A a= new A();
        a.methodA(new C());
    }
}
//class A{
//    public void methodA( B b){
//        b.methodB();
//    }
//}
//class B{
//    public void methodB (){
//        System.out.println( " method B()");
//    }
//}
//근데 여기서 클래스 c로 바꿔 줄려고 한다. 그러면 B를 다 C로 바꿔야 한다. 하지만 interafce를 이용하면,

class A{

    public void methodA (I i){
        i.methodB();
    }
}

interface I{
    void methodB(); //public abstract 생략
}
//class B implements I{
//    public void methodB(){
//        System.out.println( "method B()");
//    }
//}


class C implements I{
    public void methodB(){
        System.out.println( "method C()");
    }
}