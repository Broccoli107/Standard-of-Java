package 남궁성_12_06;

public class equals오버라이딩 {
    public static void main(String[] args) {
        Point p= new Point(1,1);

        System.out.println(p.equals(p));
;
    }



}
class Point {
    int x ;
    int y ;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }



    public boolean equals(Object obj){
        if (obj.getClass() != getClass())
            return false;


            if ( this.x == this.y)
            return true;

            return false;
        }

    }

