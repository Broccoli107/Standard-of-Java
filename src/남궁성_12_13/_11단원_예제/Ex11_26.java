package 남궁성_12_13._11단원_예제;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_26 {
    public static void main(String[] args) {

        Set set = new TreeSet();

        for( int i =0; set.size()<6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        System.out.println(set);// TreeSet은 HashSet과 다르게 순서대로 정렬해서 나온다.






    }




}
