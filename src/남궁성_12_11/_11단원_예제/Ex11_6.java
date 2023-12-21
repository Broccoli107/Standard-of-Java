package 남궁성_12_11._11단원_예제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex11_6 {
    public static void main(String[] args) {
        ArrayList a1 =new ArrayList(100000);
        LinkedList l1= new LinkedList();
        add(a1);
        add(l1);
        System.out.println("=접근시간테스트");
        System.out.println("ArrayList: " +   access(a1));
        System.out.println("LinkedList: " + access(l1));

    }

public static void add (List list){
        for (int i=0; i<10000; i++) list.add(i+"");
}
public static long access (List list){
        long start = System.currentTimeMillis();
        for (int i =0; i<10000; i++) list.get(i); // get()메서드 (객체를 반환하는메서드)를 통해 각 데이터에 접근한다.
        long end = System.currentTimeMillis();
        return end-start;
}


}
