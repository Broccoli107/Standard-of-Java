package 남궁성_12_01._7단원_예제;

public class Ex7_7{
    public static void main(String[] args) {
        point3d p= new point3d(1,2,3);
        System.out.println( p.method());
    }
}
class Point{
    int x, y;
    Point() {}
Point(int x,int y ){
    //원래 여기에 super();를 생성해야하지만 컴파일러가 자동으로 생성해준다.
    this.x= x;
    this.y= y;
}
String getLocation(){
    return "x: "+x+"y: "+y;
}
}

class point3d extends Point{
int z;
    point3d(int x, int y, int z){
        //super(){}가 자동으로 들어와 조상의 생성자를 생성한다. 이건 문법이다. 생성자의 첫줄에는 다른 생성자를 생성한다.
//        this.x= x;
//        this.y= y;
        super(x,y);//조상 변수는 조상이 초기화를 해준다.

        this.z= z;
    }

    String method(){
        return "x:"+x+ " y:"+y+" z:"+z;
    }

        }