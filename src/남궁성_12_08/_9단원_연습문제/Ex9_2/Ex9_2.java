package 남궁성_12_08._9단원_연습문제.Ex9_2;

public class Ex9_2 {
    public static void main(String[] args) {

        Point3D p1 = new Point3D(1 ,2,3);
        Point3D p2 = new Point3D(1 ,2,5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

    }
}

class Point3D {
    int x, y, z;

    Point3D (){
        this (0,0,0);

    }

    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
// int x, y,z 값을 비교하는 메서드로
public boolean equals (Object obj){
Point3D p = (Point3D)obj;
return x==p.x && y==p.y && z==p.z;



    }


//인스턴스 변수 x, y, z의 내용을 출력하도록

    public String toString(){
        return "["+x+","+y+","+z+"]";
    }



}