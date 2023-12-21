package 남궁성_11_30._7단원_예제;

//1.Tv클래스 생성

//3. 기능을 테스트한다.
class Tv{
    Tv(){}

    boolean power;
    int channel;
    void power() {power=!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel; }
}

//2.Tv클래스에서 기능을 추가 해서 captionTv를 만든다.

class captionTv extends Tv{
    captionTv(){}

    boolean caption;
    void display(String text){
        if (caption){
            System.out.println(text);
        }
    }
}
//3. 추가된 기능 과 기존 기능을 captionTv를 통해 테스트 해본다.
class Ex7_1{
    public static void main(String[] args) {
        captionTv c=new captionTv();
        c.channel=10;
        c.channelUp();
        System.out.println(c.channel);
        c.caption=true;
        c.display("Hello World");
    }
}





























