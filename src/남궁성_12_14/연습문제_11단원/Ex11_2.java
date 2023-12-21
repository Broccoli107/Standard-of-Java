package 남궁성_12_14.연습문제_11단원;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex11_2 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        System.out.println(list);
        HashSet set =new HashSet(list);
        System.out.println(set);

    }

}
