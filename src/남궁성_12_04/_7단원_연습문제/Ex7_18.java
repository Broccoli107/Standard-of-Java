package 남궁성_12_04._7단원_연습문제;

public class Ex7_18 {

    public static void main(String[] args) {
        Robot[] arr ={ new DanceRobot(), new SingRobot(), new DrawRobot()};

            action(arr[0]);
            action(arr[1]);
            action(arr[2]);


    }

//DanceRobot인 경우, dance()를 SingRobot인 경우, sing()을, DrawRobot인 경우 draw를 호출하는 action 메서드 작성
//반환 타입: 없음
// 매개 변수 : Robot r (타입이 로봇인 참조변수 r)

    static void action(Robot r){
        if( r instanceof DanceRobot){
           ((DanceRobot) r).dance();
        }
        else if (r instanceof  SingRobot) {
            ((SingRobot) r).sing();
        }
        else if (r instanceof DrawRobot) {
            ((DrawRobot) r).draw();
        }


    }


}










class Robot {}

class DanceRobot extends Robot{
    void dance (){
        System.out.println(" 춤을 춥니다.");
    }
}

class SingRobot extends Robot{
    void sing (){
        System.out.println( "노래를 합니다.");
    }
}

class DrawRobot extends Robot {
    void draw (){
        System.out.println( "그림을 그립니다.");
    }
}