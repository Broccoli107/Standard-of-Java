package 남궁성_12_06._8단원_예제;

class MyException extends Exception{
    private final int ERR_CODE; //생성자를 통해서 초기화를 한다.

    MyException (String msg, int errCode){
        super (msg); //조상(Exception의 생성자를 호출
        ERR_CODE =errCode;
    }
    MyException (String msg){
        this (msg, 100);    //에러 코드의 기본 값을 100으로 설정
    }

    public int getErrCode(){
        return  ERR_CODE; //에러 코드의 값을 얻어낼 수 있는 메서드
    }


}
