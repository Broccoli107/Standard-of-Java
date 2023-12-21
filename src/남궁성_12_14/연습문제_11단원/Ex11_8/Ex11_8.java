package 남궁성_12_14.연습문제_11단원.Ex11_8;


import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//총점을 기준으로 내림차순으로 정렬
class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int total;

    int schoolRank;


    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

        total= kor +eng +math;
    }

    int getTotal() {
        return total;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }






    public String toString() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                +","+schoolRank
                ;
    }

    //total을 기준으로 내림차순
    public int compareTo( Object o) {
        //일단 o에는 total이 없으므로 total을 가지고 있는 Student 로 형변환 해야한다.
        if(o instanceof Student ){
            int totalScore = ((Student) o).total;

            return totalScore- this.total;

        }

        return -1;
    }


}
public class Ex11_8 {
    //등수를 출력하는 메서드
    public static void calculateSchoolRank(List list){
        Collections.sort(list);//list를 총점 기준 내림차순으로 정렬한다.

        int prevRank =-1;
        int prevTotal =-1;
        int length =list.size();

        //반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.

        for( int i=0; i<length; i++){
            Student s= (Student) list.get(i);
            //총점이 이전 총점과 같으면 이전 등수를 등수로 한다.
            if(s.total==prevTotal) s.schoolRank= prevRank;
            //총점이 서로 다르면 등수의 값을 알맞게 계산해서 저장한다.
            else{
                s.schoolRank=i+1;

            }
            //현재 총점과 이전 총점 등수를 이전총점과 이전 등수에 저장
            prevTotal=s.total;
            prevRank=s.schoolRank;
        }


    }








    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student("김자바", 1, 3, 80, 80, 90));
        list.add(new Student("이자바", 2, 4, 70, 90, 70));
        list.add(new Student("인자바", 2, 5, 60, 100, 80));

      calculateSchoolRank(list);

        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());


    }






}
