package 남궁성_11_24;

//1.클래스 생성
class MyMath{
    long a,b;
    //2. 인스턴스 메서드 생성
    long add (){
        return a+b ;
    }
    long subtract()  {
        return a-b ;
    }
    long multiply()  {
        return a*b ;
    }

    long divide()  {
        return a/b;
    }



     //3.클래스 메서드 생성
    static long add (long a, long b){
        return a+b;
    }




}
//4. 메서드 호출및 출력