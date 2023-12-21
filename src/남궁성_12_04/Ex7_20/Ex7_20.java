package 남궁성_12_04.Ex7_20;

public class Ex7_20 {
    public static void main(String[] args) {
        Parent p= new Child();
        Child c= new Child();

        System.out.println("p.x= "+p.x);//p.x는 super.x 그러니 100
        p.method();//child의 메서드 가 나온다.
        System.out.println();
        System.out.println( "c.x= "+c.x);    // c.x는 this.x 그러니 200 이 나온다.
        c.method();

    }


}


class Parent{
    int x= 100;

    void method(){
        System.out.println( "Parent Method");
    }
}


class Child extends Parent{
    int x =200;

    void method(){
        System.out.println( "x= "+x);
        System.out.println( "super.x= "+ super.x);
        System.out.println( "this.x= "+ this.x);
    }
}