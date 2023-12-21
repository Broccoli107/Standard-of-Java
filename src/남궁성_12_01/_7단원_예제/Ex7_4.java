package 남궁성_12_01._7단원_예제;

public class Ex7_4 {
    public static void main(String[] args) {

    Child2 c= new Child2();
    c.method();


    }

}
class Parent2{
    int x=10;
}
class Child2 extends Parent{

int x=20;
void method(){
    System.out.println("x =" +x);//가까운 x
    System.out.println("x =" +this.x);// 인스턴스변수 x
    System.out.println("x =" +super.x);//조상의 인스턴스변수 x
}

}