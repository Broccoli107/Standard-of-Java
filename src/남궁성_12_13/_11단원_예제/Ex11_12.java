package 남궁성_12_13._11단원_예제;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11_12 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3); //new Integer (3) 인데 autoboxing
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);
        //왜 1,2,5,3,4 로 나오는지는 범위를 벗어나는 내용이다.

        Object obj = null;
        while ((obj = pq.poll())!=null){
            System.out.println(obj);
        }



    }
}
