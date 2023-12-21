package 남궁성_12_04._7단원_연습문제;

class Outer3 {
    int value =10;
class Inner {
    int value =20;
    void method1(){
        int value =30;

        System.out.println(value);
        System.out.println(this.value);
        System.out.println(Outer3.this.value);

    }
}


}



public class Ex7_27 {
    public static void main(String[] args) {
        //외부 클래스 생성
        Outer3 o =new Outer3();
        Outer3.Inner inner= o.new Inner();

        inner.method1();
    }



}
