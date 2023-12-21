package 남궁성_12_06.연습문제_6_7단원;

class MyPoint{
    int x, y;

    MyPoint (int x, int y){
        this.x = x;
        this. y= y;

    }

//두점사아의 거리를 구하는 인스턴스 메서드
//메서드명: getDistance
//매개변수: int x
//반환 타입: double

double getDistance (int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*y-this.y); //인스턴스 변수를 사용하니 인스턴스 메서드이다.
}


}


public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint p= new MyPoint(1,1);


        System.out.println( p.getDistance(2,2));
    }


}
