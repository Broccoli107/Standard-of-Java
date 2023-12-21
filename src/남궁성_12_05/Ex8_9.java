package 남궁성_12_05;

public class Ex8_9 {
    public static void main(String[] args) {
        try {
        Exception e= new Exception("고의로 발생 시켯음");//Exception 이라는 예외최고조상 클래스 객체생성
        throw e; //예외를 발생시킨다.->catch 문으로 이동
        }
        catch ( Exception e){//예외 객체와 타입이 일치 catch 문 실행
            System.out.println( "에러메서지:"+ e.getMessage());
            e.printStackTrace(); //에러 정보
        }
        System.out.println("프로그램 정상 종료되었습니다.");
    }
}
