package 남궁성_11_24;

public class ex6_1 {
    class Tv {
        String color;
        boolean power;
        int channel;
        void channelDown() {--channel;}
    }
        class TvTest{
            public void main(String[] args) {


                Tv t= new Tv();// Tv 객체 생성,t참조변수를 통해 객체를 이용한다.
                t.channel=7; //t가 가르키는 객체에 channel 값에 7을 집어넣는다.

                t.channelDown();//처널을 낮추는 메서드를 실행한다.

                System.out.println("현재 체널은 "+t.channel+"입니다.");
            }
        }






    }


