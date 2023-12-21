package 남궁성_12_04._7단원_연습문제;

//1.외부 클래스에서 접근을 못하게 변수를 private로 설정한다.
class MyTv2{
private     boolean isPowerOn;
private     int channel;
private     int volume;
private     int prevChannel;
    final int MAX_VOLUME =100;
    final int MIN_VOLUME =0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL =1;
//2. 변수의 값을 메서드를 통해서 변경을 할 수있도록 한다.
//메서드 setChannel : 현재 처널을 설정한다.
// 매개변수 :int channel
// 출력 타입: int

int setChannel( int channel){
    this.prevChannel=channel;
    return  this.channel=  channel;

}




//메서드 getChannel :현재 체넣을 얻는 다.
//매개변수: iv
//출력타입: int

int getChannel () {
    return this.channel;
}

//볼륨도 똑같이

    int setVolume(int volume ){
        return  this.volume=  volume;
    }
    int getVolume () {
        return this.volume;
    }

//7_11 여기서 현재체널을 이전 체널로 변경하는 매서드를 추가한다.
//메서드명 : gotoPrevChannel
// 매개변수: 없음
//반환타입: 없음
//이전 체널을 저장하는 맴버변수
    void gotoPrevChannel (){


}

}


public class Ex7_10{
    public static void main(String[] args) {
        MyTv2 t= new MyTv2();
        t.setChannel(10);
        System.out.println( "CH: " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH; "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH; "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH; "+t.getChannel());


    }

}
