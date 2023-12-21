package 남궁성_12_04.Ex7_17;

public class Ex7_17 {
    public static void main(String[] args) {

    FireEngine fe= new FireEngine();

    if ( fe instanceof  FireEngine){
        System.out.println(" This is a FireEngine instance");

    }
    if( fe instanceof Car){
        System.out.println( "This is a Car instance");
    }
    if ( fe instanceof Object){
        System.out.println( " This is a Object instance");
    }
        System.out.println( fe.getClass().getName());//클래스의 이름 출력
    }

}

class Car{
    String color;
    int door;
    void drive(){
        System.out.println("drive, brrrr");

    }
    void stop(){
        System.out.println("Stop!!");
    }
}

class FireEngine extends Car {
    void water(){
        System.out.println("water!!");
    }
}



