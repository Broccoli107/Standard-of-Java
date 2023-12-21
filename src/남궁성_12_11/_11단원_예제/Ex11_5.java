package 남궁성_12_11._11단원_예제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList(2000000);
        LinkedList l1= new LinkedList();

        System.out.println( "= 순차적으로 추가하기 =");
        System.out.println("ArrayList:"+ add1(a1));
        System.out.println("LinkedList:"+ add1(l1));

        System.out.println( "= 비순차적으로 추가하기 =");
        System.out.println("ArrayList:"+ add2(a1));
        System.out.println("LinkedList:"+ add2(l1));

        System.out.println( "= 비순차적으로 삭제하기 =");
        System.out.println("ArrayList:"+ remove2(a1));
        System.out.println("LinkedList:"+ remove2(l1));

        System.out.println( "= 순차적으로 삭제하기 =");
        System.out.println("ArrayList:"+ remove1(a1));
        System.out.println("LinkedList:"+ remove1(l1));





    }
//순차적으로 데이터 추가
public static long add1 (List list){// List는 Linked list와 ArrayList의 조상
    long start = System.currentTimeMillis();
    for (int i=0 ; i<1000000; i++) list.add (i+""); //1부터 1000000까지 문자열 숫자를 집어 넣는다.
    long end = System.currentTimeMillis();
    return end - start; //걸리는 시간 계산
}
//비순차적으로 데이터 추가
public static long add2 (List list){
        long start = System.currentTimeMillis();
        for ( int i=0; i<10000; i++) list.add(500,"x");//인덱스가 500인 곳에 문자열 "x"를 추가 (중간에 추가)
        long end = System.currentTimeMillis();
        return end - start;
}

//슌차적으로 데이터 삭제
public static long remove1 (List list){
        long start = System.currentTimeMillis();
        for( int i= list.size()-1; i>=0; i--){ //마지막을 시작으로 차래로 삭제 진행
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return  end -start;
}


//비순차적으로 데이터 삭제
public static long remove2 (List list){
        long start = System.currentTimeMillis();
        for ( int i= 0; i<10000; i++)list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }




}
