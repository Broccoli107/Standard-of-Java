package 남궁성_12_13._11단원_예제;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_14 {
    public static void main(String[] args) {

        ArrayList list =new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");


        Iterator it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

//        while(it.hasPrevious()){
//            System.out.println(it.previous);
//    }
//

    }
}
