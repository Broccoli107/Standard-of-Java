package 남궁성_11_29._6단원_연습문제;


class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final  int MIN_CHANNEL = 0;

    void turnoff(){
        isPowerOn = !isPowerOn;
    }



    //volume 값이 MAX_VOLUME 보다 작을때만 값을 1증가
    void volumeUp(){
            if(volume<MAX_VOLUME) ++volume;
            else if (volume>=MAX_VOLUME) {
                volume= MAX_VOLUME;
            }

    }
    void volumeDowun(){
        if(volume>MIN_VOLUME) --volume;
        else if (volume<= MIN_VOLUME) {
            volume= MIN_VOLUME;
        }
    }


    //channel 값을 1증가시킨다.
    // 만일 ch
    void channelUP(){
        if(channel==MAX_CHANNEL){
            channel=MIN_CHANNEL;
        } else ++channel;
    }



    void channelDown(){

        if( channel==MIN_CHANNEL)
            channel=MAX_CHANNEL;
        else
            channel--;
        }


    }









public class Ex6_21 {
    public static void main(String[] args) {
        MyTv t =new MyTv();
        t.channel=100;
        t.volume=0;
        System.out.println("CH:" + t.channel+", VOL: "+ t.volume);

        t.channelDown();
        t.volumeDowun();
        System.out.println("CH:" + t.channel+", VOL: "+ t.volume);
        t.volume =100;
        t.channelUP();
        t.channelUP();
        t.volumeUp();
        System.out.println("CH:" + t.channel+", VOL: "+ t.volume);
    }

}
