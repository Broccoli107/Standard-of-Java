package 남궁성_12_14.연습문제_11단원;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_1 {
    public static void main(String[] args) {
        // 두 정수 집합의 합집합, 교집합, 합집합을 구해라
        //일단 정수 집합을 집어넣을 Arraylist 객체 생성
        ArrayList list1 =new ArrayList();
        ArrayList list2 = new ArrayList();

        //교집합, 합집합, 차집합을 집어넣을 리스트도 생성
        ArrayList hap= new ArrayList();
        ArrayList cha = new ArrayList();
        ArrayList kyo = new ArrayList();
        //각 리스트 에 객체를 집어 넣어준다.
        list1.add(1); //1은 auto-boxing 으로 new Integer (1)이 되서 객체로 들어간다.
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        //교집합 list 1 안에 있는 것들중 2에 들어있는것만 집어 넗어주낟.
        //그렇다면 list1안에 뭐가 있는지 읽는 iterator가 필요하다.
        Iterator it = list1.iterator();

//        while (it.hasNext()){
//            if(list2.contains(it.next())){
//                kyo.add(it.next()); 이렇게 하면 it.next() 메서드가 한 번에 두번 호출되어서 다음다음께 저장이된다.
//            }
//        }


        while (it.hasNext()){
            Object obj = it.next();
                    if(list2.contains(obj))
                        kyo.add(obj);

        }
        //맞는지 출력
        System.out.println(kyo);

        //차집합은 반대
         it= list1.iterator();//iterator는 일회용이라 다시생성해 줘야한다.

        while ( it. hasNext()){
            Object obj = it.next();

            if(!list2.contains(obj))
                cha.add(obj);
        }
        System.out.println(cha);

        //합집합은 listb 에 차집합 더하면 된다.


        it= list1.iterator();//iterator는 일회용이라 다시생성해 줘야한다.
        while ( it. hasNext()){
            Object obj = it.next();

            if(!list2.contains(obj))
                hap.add(obj);
        }

        it= list2.iterator();
        while (it.hasNext()){
            Object obj = it.next();

            hap.add(obj);
        }
        System.out.println(hap);









    }
}
