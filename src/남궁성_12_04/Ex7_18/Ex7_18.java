package 남궁성_12_04.Ex7_18;

public class Ex7_18 {
    public static void main(String[] args) {
      //각 객체 생성
      Parent p = new Child();
      Child c = new Child();

        System.out.println("p.x= "+ p.x);//여기서 p.x는 super.x
        p.method();
        System.out.println("c.x= " + c.x);//여기서 c.x는 this.x
        c.method();
    }
}


//부모 클래스 작성
class  Parent{
    int x= 100; //super.x
    void method (){
        System.out.println("Parent Method"); //
    }
}
class Child extends Parent{
    int x =100; //this.x
    void method
            (){
        System.out.println(" Child Method");
    }
}