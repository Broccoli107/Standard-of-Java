package 남궁성_12_01._7단원_예제;

public class Ex7_6 {
    public static void main(String[] args) {

        Child c = new Child();

        c.method();


    }
}
class Parent{
        int x=10;
}
class Child extends Parent{
    void method(){
        System.out.println("x="+ x);
        System.out.println("x="+ this.x);
        System.out.println("x= "+ super.x);
    }

    }



