package 남궁성_11_30._7단원_예제;

public class Ex7_2 {
    public static void main(String[] args) {

    }
}
//1.도형을 의미하는 Shape 클래스 정의
class Shape{
    String color ="black";
    void draw(){
        System.out.printf("[color=%s]%n", color);
    }
}

//2. 2차원 좌표를 의미하는 point 클래스를 정의
class Point{
    int x;
    int y;

    Point (int x, int y){ //생성자 생성
        this.x=x;
        this.y=y;
    }
    Point(){
        this.x=0;
        this.y=0;
    }
String getXY(){
        return "("+x+","+y+")";
}
}

//3.위 두 클래스를 이용해서 Circle이랑 Triangle 클래스를 정의
class Circle extends Shape {// Circle은 Shape을 상속 받는다.
    Point center; //circle은 Point를 포함한다.
    int r;



    Circle(){
        this( new Point(0,0), 100);
    }
    Circle (Point center , int r){
        this.center=center;
        this.r =r;
    }
    void draw() {
        System.out.printf("[center =(%d, %d] r= %d, color= $s]%n", center.x,center.y, r, color);
    }
}
