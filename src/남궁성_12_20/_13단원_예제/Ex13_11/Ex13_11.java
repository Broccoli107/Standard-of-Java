package 남궁성_12_20._13단원_예제.Ex13_11;

import java.util.Iterator;
import java.util.*;

public class Ex13_11 {
    public static void main(String[] args) throws Exception {
        ThreadEx11_1 t1 = new ThreadEx11_1 ("Thread1");
        ThreadEx11_2 t2 = new ThreadEx11_2( "Thread2");
        t1.start();
        t2.start();




    }



}
class ThreadEx11_1 extends  Thread {
    ThreadEx11_1 (String name){
        super(name);
    }

    public void run(){
        try {
            sleep( 5*1000);
        }catch (InterruptedException e){}//스레드가 중단했을 떄 예외

    }

}
class  ThreadEx11_2 extends Thread {
    ThreadEx11_2 (String name){
        super(name);
    }


public void run () {
    Map map = getAllStackTraces();
    Iterator it = map.keySet().iterator();
    int x =0;
    while ( it.hasNext()){
        Object obj = it.next();
        Thread t =(Thread)obj;
        StackTraceElement[] ste = (StackTraceElement[]) (map.get(obj));

        System.out.println();

        for (int i=0; i<ste.length; i++){
            System.out.println(ste[i]);
        }
        System.out.println();

    }

}
}