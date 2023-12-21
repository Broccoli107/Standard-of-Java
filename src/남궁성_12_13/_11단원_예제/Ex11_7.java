package 남궁성_12_13._11단원_예제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_7 {
    public static void main(String[] args) {
        Stack st = new Stack(); //스택 저장소 생성
        Queue q = new LinkedList(); //큐 저장소 생성 큐는 인터페이스이기 때문에 Queue를 구현한 클래스의 객체를 생성해 줘야 한다.

        //data를 집어넣는다.
        st.push("0");
        st.push("1");
        st.push("2");


        q.offer("0");
        q.offer("1");
        q.offer("2");


        //stack은 위에서 부터
        System.out.println("=Stack=");
        while (!st.empty()) {
            System.out.println(st.pop());
        }
        //queue 는 아래서 부터 data가 나온다.
        System.out.println("=Queue=");
        while (!q.isEmpty())
            System.out.println(q.poll());







    }
}
