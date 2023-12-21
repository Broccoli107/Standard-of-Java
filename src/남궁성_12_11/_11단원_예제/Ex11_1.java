package 남궁성_12_11._11단원_예제;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10); //기본 길이가 10인 ArrayList 생성
        //ArrayList 는 객체 배열
        list1.add(new Integer(5));
        //list1.add(5)도 가능하다. autoboxing때문에 그냥

        list1.add(new Integer(4));
        list1.add ( new Integer(2));
        list1.add( new Integer(0));
        list1.add ( new Integer(1));
        list1.add ( new Integer(3));

        ArrayList list2 =new ArrayList(list1.subList(1,4)); //1이상 4미만 배열을 복사해서 새로운 배열 list2 를 만든다.
        print (list1, list2);


        Collections.sort(list1); //Collections 클래스의 sort 메서드 호출, 오름차순으로 정리
        Collections.sort(list2);
        print( list1, list2);


        list2.add("B");
        list2.add ("C");
        list2.add (3, "A");//인덱스가 3인곳에 "A"를 추가한다.
        list1.add("7");
        list1.add("7");
        list1.add("7");
        list1.add("7");
        list1.add("7");
        list1.add("7");
        print(list1, list2);
        list1.set(0,"1");//문자열 1을 추가
        System.out.println();


      //  list1.remove(1) 이건 인덱스가 1인 곳을 삭제
     //   list1.remove( new Integer(1))은 숫자 1을 삭제



    }

public static void print ( ArrayList list1, ArrayList list2){
    System.out.println("list1= "+list1);
    System.out.println("list2= "+ list2);
    System.out.println();
}

}
