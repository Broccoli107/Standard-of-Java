package 남궁성_12_04;

public class Ex7_16 {
    public static void main(String[] args) {


        Car2 car = new Car2();
        Car2 car2 = null;
        FireEngine fe = null;

        car.drive();
         //   fe =(FireEngine)car; 에러가 난다. 이유: 자손타입의 참조변수로는 조상 객체를 가르킬수 없다.
        fe.drive();
     //   car2 =(Car2)fe;
        car2.drive();

    }
}


class Car2{
    String color;
    int door;
    void drive(){
        System.out.println("drive, brrrr");

    }
    void stop(){
        System.out.println("Stop!!");
    }
}

class FireEngine2 extends Car2{
    void water(){
        System.out.println("water!!");
    }
}