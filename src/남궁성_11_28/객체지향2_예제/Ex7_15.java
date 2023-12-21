package 남궁성_11_28.객체지향2_예제;

public class Ex7_15
{
    public static void main(String[] args) {


        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();

        fe.water();//참조 변수  fe로 water메서드를 호출
        car= fe; // 참조변수 car에 fe 주소값을 복사
        //car.water() 는 안된다.
        fe2= (FireEngine) car;// car는 Car타입 fe2는 FireEngine타입 서로 타입이 다르니 형변환을 시켜서 타입을 일치시킨다.
        fe2.water();

    }
}

class Car{
    String color;
    int door;


    void drive(){
        System.out.println( "drive, brrr");
    }

    void stop(){
        System.out.println("stop!!!");
    }


}
class  FireEngine extends Car {
    void water(){
        System.out.println("water!!!");
    }
}