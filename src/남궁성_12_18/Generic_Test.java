package 남궁성_12_18;

import java.util.ArrayList;

public class Generic_Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add("30"); //ArrayList는 Object타입의 배열이기 때문에 모든 타입이 들어갈 수있다.

        Integer i = (Integer) list.get(2); //
        System.out.println(i);//ClassCastException이 발쌩한다.

    }
}

