package 남궁성_12_04;


class Ex7_15 {
    public static void main(String[] args) {
        Car car =null;
        FireEngine fe =new FireEngine();
        FireEngine fe2 = null;
        fe.water();
        car =fe ;//car 참조 변수에 fe의 주소값이 들어간다. 그래서 FireEngine 객체를 가르킨다.
       // car.water(); 는 에러난다. 왜냐하면 car의 리모컨에는 water라는 메서드가 없기 때문이다.
        fe2 =(FireEngine)car;
        fe2.water();



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

class FireEngine extends Car{
    void water(){
        System.out.println("water!!");
    }
}