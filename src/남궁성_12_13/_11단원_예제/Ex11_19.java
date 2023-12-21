package 남궁성_12_13._11단원_예제;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_19 {
    public void main(String[] args) {

        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        //정렬
        Arrays.sort(strArr);//원래는 비교 기준인 comparator 가 필요하지만 String 클래스안에 인터페이스 comparable이 구현되어 있으므로 필요가없다.
        System.out.println(Arrays.toString(strArr));
        //대소문자 구별없이 정렬
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));

        //역순으로 정렬
        Arrays.sort(strArr, new Descending());//역순으로 정렬해주는 인터페이스 comparator를 구현
        System.out.println(Arrays.toString(strArr));

    }

}
class Descending implements Comparator {
        public int compare (Object o1, Object o2){
            if (o1 instanceof Comparable && o2 instanceof Comparable) { //이전에 형변환이 가능한지 검사
                Comparable c1 = (Comparable) o1; // compareTo()메서드를 사용하기 위해 형변환
                Comparable c2 = (Comparable) o2;
                return c1.compareTo(c2) *-1 ; //추상메서드인 compareTo()를 사용할 수있는이유 인터페이스인 Comparable과 형변환이 가능하다는건
                //그의 자손이 이라는거다. 인터페이스의 자손은 추상메서드를 구현한 클래스 고로 compareTO를 사용할 수있다고 확실하게 애기할 수있다.
        }


            return -1;
    }



}

