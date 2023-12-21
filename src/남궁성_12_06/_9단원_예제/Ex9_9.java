package 남궁성_12_06._9단원_예제;

public class Ex9_9 {
    public static void main(String[] args) {
        Circle c1 = new Circle( new Point2(1,1), 2.0);

    }
}
class Circle implements Cloneable {
    Point2 p;
    double r;

    Circle(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }


    public Circle shallowCopy() { //얕은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }

        return (Circle) obj;
    }

public Circle deepCopy (){
        Object obj =null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException e){}

    Circle c= (Circle) obj;

    c.p =new Point2(this.p.x, this.p.y);
    return c;
    }

public String toString(){
        return "[p="+p+ ", r="+r+"]";
}


}

class Point2 {
    int x;
    int y;

    Point2 (int x, int y){
        this.x =x;
        this.y =y;
    }
public  String toString(){
        return "x= "+x+ "y="+y;
}
}