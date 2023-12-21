package 남궁성_12_04.Point_quiz.q_1_4;

public class q_1_4 {
    public static void main(String[] args) {


        System.out.println(Point.getDistance(new Point(1,1), new Point(2,2)));

    }


}


class Point {
    int x, y;

    //기본 생성자 생성
    Point() {
    }

    ;

    //생성자 생성
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    static double getDistance(Point p1, Point p2) { //처음에는 static 메서드이니까 인스턴스 변수를 쓰면 안된다라고 생각을 했는데 생각을해보니
        //여기서 사용하는건 리모컨, 참조변수를 이용하는거다.
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));


    }

}