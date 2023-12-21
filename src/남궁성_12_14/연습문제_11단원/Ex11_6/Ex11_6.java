package 남궁성_12_14.연습문제_11단원.Ex11_6;


import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage()
                ;
    }
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student tmp = (Student) o;
            return name.compareTo(tmp.name);
        } else {
            return -1;
        }
    }

}



public class Ex11_6 {

    //평균점수 범위를 주면 해당 범위에 속한 학생수가 몇명인지 반환하는 메서드
//    static int getGroupCount (TreeSet tset, int from, int to){
//
//
//
//
//
//
//
//    }



    public static void main(String[] args) {

        TreeSet set = new TreeSet(new Comparator() {
            //평균을 기준으로 정렬하는 메서드
            public int compare(Object o1, Object o2) {
                // 들어오는 객체가 Student로 형변환이 가능한지
                if( o1 instanceof Student && o2 instanceof Student) {
                    //Student로 형변환이 가능하다면 getTotal() 메서드를 호출할 수있다.
                    //메서드 호출해서 저장
                    float avgScore1= ((Student) o1).getAverage();
                    float avvgScore2= ((Student) o2).getAverage();
                    return (Float.compare(avvgScore2, avgScore1)*-1);
                }

                return -1;
            }
        });


        set.add(new Student("홍길동",1,1,100,100,100));
        set.add(new Student("남궁성",1,2,90,70,80));
        set.add(new Student("김자바",1,3,80,80,90));
        set.add(new Student("이자바",1,4,70,90,70));
        set.add(new Student("인자바",1,5,60,100,80));


        Iterator it = set.iterator();

        while (it.hasNext())
            System.out.println(it.next());







    }







}
