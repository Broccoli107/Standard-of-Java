package 남궁성_12_13._11단원_예제;

import java.util.Comparator;
import java.util.TreeSet;
//만약이 비교 기준이 없는 객체를 TreeSet에 저장할려면
public class Ex11_26_2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();




        set.add(new test());
        set.add(new test());
        set.add(new test());
        set.add(new test());
        System.out.println(set);

    }


}

class test implements Comparable{
    @Override
    public int compareTo(Object o) {
        return -1;
    }
} //비교기준이 없어서 에러가 난다. 그래서 비교기준인 Comparator를 집어넣거나 test에다가 Compareable를 구현해 줘야 한다.

class testcomp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return -1; //계속 왼쪽으로 저장
    }
}

