package 남궁성_12_13._11단원_예제;

import java.util.TreeSet;

public class Ex11_29 {
    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        int [] score = {80, 95, 50, 35, 45, 65, 100 };


        for ( int i  =0; i<score.length; i++){
            set.add(new Integer(score[i]));
        }
        System.out.println(set);
        System.out.println("50보다 작은 값"+ set.headSet(50)); //headSet 메서드: 지정된 객체보다 더 작은 객체들을 반환한다.
        System.out.println("50보다 큰 값"+ set.tailSet(50));//tailSet 메서드: 지정된 객체보다 더 큰 객체들을 반환한다.
    }
}
