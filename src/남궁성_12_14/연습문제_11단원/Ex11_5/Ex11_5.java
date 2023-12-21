package 남궁성_12_14.연습문제_11단원.Ex11_5;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable { //학생들의 공통점이있는 이름, 반, 번호, 국어점수, 영어점수, 수학점수를 class에 묶어준다.(그룹화
    String name ;
    int ban ;
    int no;

    int kor, eng, math;

    //간단히 초기화 하기 위해 생성자를 생성


    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

//총점을 구할 수 있는 메서드 getTotal을 작성
int getTotal(){

        return kor+ eng  + math;
}

// 평균을 구하되 소수점 둘째 자리 에서 반올릶하는 메섣드
float getAverage(){
        return  (int)((getTotal()/3f)*10+0.5)/10f;


}




    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ","+getTotal()+ " ,"+ getAverage()+
                '}';
    }


    public int compareTo( Object o) {
        //문자 하나하나 비교하는 방법도 있지만 String 클래스에 CompareTo()를 이욯하면 간단하게
        //끝낼수 있으니 이용한다. 왠민하면 비교하는 객체를 클래스 맞게 형변환해서  타입에 Compare 나 CompareTo() 가  구현되어 있으면 이용하자
        //괜히 for문 돌려서 뭐 일일히 비교하지말고
    if(o instanceof Student){//null은 형변환이 불가능하므로 걸러진다.
        Student tmp =(Student)o;

       return this.name.compareTo(tmp.name);//문자열을 사전순으로 비교해서 음수나 양수를 반환한다.

    }



        return -1;
    }
}










public class Ex11_5 {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        // ArrayList 라는 컬랙션프레임웍 (객체를 저장하는형태) 에 객체를 저장한다.
        list.add( new Student("홓길동",1,1,100,100,100) );
        list.add( new Student("남궁성",1,2,90,70,80) );
        list.add( new Student("김자바",1,3,80,80,90) );
        list.add( new Student("이자바",1,4,70,90,70) );
        list.add( new Student("안자바",1,5,60,100,80) );
        //list를 정렬하기 위해 Collections 유틸의 sort 메서드를 호출 물론 비교기준이 없다면 정렬을 할 수없다. 비교기준인
        //Comparator 가 있던가 list 안에 객체가 비교가 가능한 객체라는 Comparable 이 구현되어 있어야 한다.
        Collections.sort(list);

        //객체 하나하나 읽어서 출력을 해줘야하니, iterator를 이용한다.
        Iterator it  = list.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }



    }
}
