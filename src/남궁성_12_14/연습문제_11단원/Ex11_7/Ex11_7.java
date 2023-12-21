package 남궁성_12_14.연습문제_11단원.Ex11_7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
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
        return kor + eng + math;
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
                ;
    }
    //  ban과 no로 오름차순으로 정렬하는     BanNoAscending 클래스 생성

}
    class BanNoAscending implements Comparator {


        //일단 우선순위는 ban 값이고 그다음이 no값이다.
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Student && o2 instanceof Student) {
                int banNum1 = ((Student) o1).ban;
                int banNUm2 = ((Student) o2).ban;
                int noNUm1 = ((Student) o1).no;
                int noNUm2 = ((Student) o2).no;
                //반의 값이 다를때
                if (banNum1 != banNUm2)
                    //정수비교
                    return banNum1 - banNUm2;

                else {
                    return noNUm1 - noNUm2;
                }

            }
            return -1;
        }


    }

    public class Ex11_7 {
        public static void main(String[] args) {

            ArrayList list = new ArrayList();
            list.add(new Student("홍길동", 1, 1, 100, 100, 100));
            list.add(new Student("남궁성", 1, 2, 90, 70, 80));
            list.add(new Student("김자바", 1, 3, 80, 80, 90));
            list.add(new Student("이자바", 2, 4, 70, 90, 70));
            list.add(new Student("인자바", 2, 5, 60, 100, 80));

            Collections.sort(list, new BanNoAscending());

            Iterator it = list.iterator();

            while (it.hasNext())
                System.out.println(it.next());


        }
    }

