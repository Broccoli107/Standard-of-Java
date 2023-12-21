package 남궁성_12_04._7단원_연습문제;

class Outer2 {
    static class Inner {
        int iv =200;
    }
}

public class Ex7_26 {
    public static void main(String[] args) {
        //static 내부클래스는 외부클래스 먼저 생성 안해도 된다.
        Outer2.Inner i= new Outer2.Inner();
        System.out.println(i.iv);
    }
}
