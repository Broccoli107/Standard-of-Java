package 남궁성_12_13._11단원_예제;
import java.util.*;
public class Ex11_20 {
    public static void main(String[] args) {

        Object[] objArr ={"1", new Integer(1), "2","2","3","3","4","4","4"};
        Set set =new HashSet();

        for( int i= 0; i< objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);//set은 중복이 안되므로 출력하면 중복을 제거한거가 출력된다.

    }
}
