package 남궁성_12_07;

public class Ex_clone {
    public static void main(String[] args) {
        Point original =new Point(1, 1);

        Point copy = (Point) original.clone();

        System.out.println(original);
        System.out.println(copy);
    }

}
class  Point implements Cloneable{
    int x;
    int y;

    Point ( int x, int y ){
        this.x= x;
        this.y= y;

    }

public String toString(){
        return "x= "+x+" y= "+y;
}

public Object clone(){ //원본은 protected 이니까 public 으로 오버라이딩 해준다.
        Object obj = null;
       try {
           obj = super.clone();
       }catch (CloneNotSupportedException e){}
        return obj;
}



}