package 남궁성_12_04.Point_quiz;

public class q_1_5 {
    public static void main(String[] args) {




    }
}
class Point {

    int x=1;
    int y=1;
Point(){
    this.x=1;
    this.y=1;
};

    Point (int x,int y){
        this.x= x;
        this.y= y;
    }


public String toString(){
        return "x= "+x+ "y="+ y;
}

double getDistance (Point p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
}



}
