package 남궁성_11_23._6단원_객체지향예제;
class ex_06_01 {
    class Tv{
        //Tv의 속성, Tv클래스의 인스턴스
    String color;//색까
    boolean power;
    int channel;
    //Tv의 기능
        void power() {power=!power;}
        void channelUp() {++channel;}
        void channelDown(){--channel;}

    }
class TvTest{
    public static void main(String[] args) {
        Tv t;
    }
}



}
