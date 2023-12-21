package 남궁성_12_13._11단원_예제;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_13 {
    public static void main(String[] args) {

        ArrayList list =new ArrayList();

        list.add ("1");
        list.add('2');
        list.add ("3");
        list.add ("4");
        list.add ("5");

        Iterator it = list.iterator(); //iterator 객체 생성

        while( it.hasNext()){//읽어올 요소가 있는지
            Object obj = it.next(); // 다음요소를 읽는다.
            System.out.print(obj+ " ");
        }

    }
}
