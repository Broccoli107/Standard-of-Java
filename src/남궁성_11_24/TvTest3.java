package 남궁성_11_24;
class Tv3{

//Tv의 변수 (리소스)
        String color;
        boolean power;
        int channel;
//Tv 메서드 (역할)

    void power(){power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}



    }

    class TvTest3{
        public static void main(String[] args) {
            Tv t1=new Tv();
            Tv t2=new Tv();
            System.out.println("t1의 channel값은"+ t1.channel+"입니다.");
            System.out.println("t2의 channel값은"+ t2.channel+"입니다.");
            t2=t1; //t2는 t1이 가리키는 객체를 가리킨다.
            t1.channel=7;
            System.out.println("t1의 channel값은"+ t1.channel+"입니다.");
            System.out.println("t2의 channel값은"+ t2.channel+"입니다.");




        }
    }

