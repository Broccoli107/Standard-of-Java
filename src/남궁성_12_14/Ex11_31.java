package 남궁성_12_14;

import java.util.*;

public class Ex11_31 {
    public static void main(String[] args) {

        HashMap  map = new HashMap(100);
        map.put(" 김자바", new Integer(100));
        map.put ("이자바", new Integer(100));
        map. put ("강자바", new Integer[80]);
        map.put("안자바", new Integer[90]);

        Set set = map.entrySet(); //HashMap의 키와값을 Set 형태로 저장 ;
        Iterator it = set. iterator();

        while (it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();//Map 인터페이스 안에있는 Entry 인터페이스에  Entry (키-값)으로 저장
            System.out.println("이름 : "+ e.getKey() + ", 점수:" + e.getValue() );

        }


        set = map.keySet();

        System.out.println("참가자 명단 :"+ set);

        Collection values =map.values();

        it = values.iterator();

        int total =0;

        while ( it. hasNext()){
            Integer i =  (Integer)it.next();
            total += i.intValue(); //Integer 객체를 int 형으로

        }


        System.out.println( "총점 :"+ total);
        System.out.println( "평균: " + (float)total/set.size());
        System.out.println("최고점수 :" +Collections.max(values));




    }
}
