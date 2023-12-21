package 남궁성_12_08._8단원_연습문제;

public class Ex8_9 {
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100); //예외 객체 생성
    }

}
class UnsupportedFuctionException extends RuntimeException {
    private int ERR_CODE =100; //private으로 보호하고 생성자로 초기화
    String s;
    UnsupportedFuctionException(String s, int ERR_CODE){
        this.s =s;
        this.ERR_CODE= ERR_CODE;
    }


    //메서드명 getERR_CODE
    //가눙: 에러코드를 반환한다.
    //반환타입: int
    //매개변수: 없음
    //제어자: public
    public  int getERR_CODE(){
        return ERR_CODE;

    }
    //메서드명:getMessagge
    //기능: 메세지명을 반환한다.
    //반환타입: String
    //매개변수: 없음\
    //제어자: public

    public  String getMessage(){
        return "["+getERR_CODE()+"]"+ s;
    }



}
