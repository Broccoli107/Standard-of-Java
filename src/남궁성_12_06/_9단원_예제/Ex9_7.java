package 남궁성_12_06._9단원_예제;

public class Ex9_7 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();
    }
}

class Point implements Cloneable { //일단 이클래스는 복사해도 된다고 선언 하는 역할
    int x, y;
    Point (int x, int y){
        this.x = x;
        this.y = y;
    }
public String toString(){
        return "x= "+x+" y= "+y;
}
public Object clone(){
        Object obj = null;
    try{
        obj= super.clone();
    }catch (CloneNotSupportedException e){}
    return obj;

    }

}
