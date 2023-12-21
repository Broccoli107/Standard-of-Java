package 남궁성_12_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class Ex11_39 {
    public static void main(String[] args) {

        List list = new ArrayList();
        System.out.println(list);

       addAll(list, 1,2,3,4,5);//한번에 Arraylist에 추가
        System.out.println(list);

        rotate(list,2); //반시계 방향으로 2번이동
        System.out.println(list);

        swap(list, 0, 2);//첫번째와 세번째를 교환
        System.out.println(list);

        shuffle(list); //저장된 위치를 임의로 변경
        System.out.println(list);

        sort (list, reverseOrder()); // 역순으로 배열
        System.out.println(list);

        sort(list); //순서대로 배열 comparable 이 없다면 안된다. 여기서는 정수 배열이기 때문에 comparable이  구현되어있어 안에 compareTo() 메서드를 통해서
        //sort로 순서대로 배열이 가능한거다.
        System.out.println(list);

        int idx= binarySearch(list, 2); //정수 2가 위치한 인덱스를 반환 물론 이분검색은 정렬후 검색해야 한다는거 잊지말길
        System.out.println(idx);

        System.out.println( "max= "+ max(list));
        System.out.println("min= "+ min (list));

        System.out.println("min ="+ max(list, reverseOrder()));
        fill(list, 9);
        System.out.println(list );








    }
}
