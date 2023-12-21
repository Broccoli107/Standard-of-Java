package 남궁성_12_04._7단원_연습문제;

public class Ex7_22 {
    public static void main(String[] args) {

    Shape[]arr = { new Circle(5.0), new Rectangle(3,4), new Circle(1)} ;
        System.out.println("면적의 합:"+ sumArea(arr) );

    }

//메서드명:sumArea
//기능: 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
// 반환타입:double
// 매개변수 Shape [] arr
static double sumArea (Shape[] arr){
        double sum =0.0;

//        sum= arr[0].calcArea()+arr[1].calcArea()+arr[2].calcArea();
        for( int i=0; i< arr.length; i++){
            sum+= arr[i].calcArea();
        }

        return sum;
}



}



abstract class Shape{
    Point p;
    Shape(){
        this( new Point (0,0));
    }

    Shape (Point p){
        this.p =p;
    }
 abstract double calcArea ();// 도형의 면적을 계산하는 메서즈

    Point getPosition (){
        return p;
    }

    void setPosition (Point p){
        this.p=p;
    }

}


//클래스명 Circle
//조상클래스: Shape
//맴버 변수 : double r
class Circle extends Shape {
    double r;

    Circle (){
        this(0);
    }
    Circle (double r){
        this.r= r;
    }

    double calcArea(){  // 추상 클래스를 상속 받았으니 추상메서드를 구현해줘야한다.
        return r*r*Math.PI;
    }



}


class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(){
        this(0,0);
    }

    Rectangle( double width, double height){
        this.width= width;
        this.height= height;
    }

    double calcArea (){
        return height*width;
    }

    //메서드: 정사각형인지 아닌지 알려준다.
    //메서드명: isSquare
    //반환타입: boolean
    //매개변수: 없음


    boolean isSquare(){
    if (width==height){
        return true;
    }
    else return false;
    }




}




class Point {
    int x,y;
Point (){
    this(0,0);
}

Point (int x, int y){
    this.x=x;
    this.y=y;
}
public String toString (){
    return "["+x+","+y+"]";
}
}