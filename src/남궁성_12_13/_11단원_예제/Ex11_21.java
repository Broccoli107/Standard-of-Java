package 남궁성_12_13._11단원_예제;

import java.util.*;

public class Ex11_21 {
    public static void main(String[] args) {
        Set set = new HashSet();
        
        for ( int i= 0 ; set.size()<6; i++){
            int num = (int)(Math.random()*45)+1;
            set.add(num);
        }

        System.out.println(set); //set 은 순서가 없다 고로 정렬도 없다 순서있게 정렬하려면 List룰 써야한다.

        List list  = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);




    }
}
