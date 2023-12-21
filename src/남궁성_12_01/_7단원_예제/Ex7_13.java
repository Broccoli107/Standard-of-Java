package 남궁성_12_01._7단원_예제;

//Test
public class Ex7_13 {
    public static void main(String[] args) {

    Time t= new Time(8,53,0);
    //t.hour=1 private으로 같은 클래스 내어서만 접근가능하게 했으니 직접 변경은 불가 그래서 메서드를 통해서 시간을 세팅해야함
    t.setHour(2);//메서드롤 통해서 iv값 변경

        System.out.println(t.getHour());//메서드를 통해서 시간을얻 얻어서 호출


        System.out.println(t);

    }


}

//일단 시,분 ,초를 가지는 Time 클래스 생성
class Time{
private int hour, minute, second; //클래스 내에서만 접근가능한 변수로

//생성자 생성

    Time(int hour, int minute, int second){
        this.hour= hour;
        this.minute= minute;
        this.second= second;
    }


//몇 시인지 얻는 메서드

    public int getHour() {
        return hour;
    }

//시간을 세팅하고 시간은 0-24가 아니면 리턴하는 메서드
//입력값: 정수
// 출력값: 그냥 인스턴스값 재세팅

    void setHour(int hour){

    if(hour<0 || hour>25) return;
        this.hour=hour;

    }

//몇 분인지 얻는 메서드

    public int getMinute() {
        return minute;
    }

//분을 세팅을 하고, 분이 0-59가 아니면 리턴
    void setMinute(int minute){
        if(minute<0 || minute>59){
            return;
        }
        this.minute=minute;
    }

    //몇 초인지 얻는 메서드

    public int getSecond() {
        return second;
    }

//분을 세팅하고  초가 0-59가 아니면 리턴
void setSecond(int second){
    if(second<0 || second>59){
        return;
    }
    this.second=second;
}


public String toString(){
        return hour+ ":"+ minute+":"+second;
}


}