package 남궁성_11_24;
class Tv {
    //클래스 Tv의 변수
    String color;
    boolean power;
    int channel;

    //클래스 Tv의 메서드
    void power() {
        power = !power;
    }

    void channelUP() {
        ++channel;
    }

    void chnnelDown() {
        --channel;
    }


}
public class Tvtest2 {

    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을" + t1.channel + "로 변경했습니다.");
        System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은" + t2.channel + "입니다.");

    }
}
