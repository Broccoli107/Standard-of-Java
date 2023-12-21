package 남궁성_12_20._13단원_예제;

public class Ex13_1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 =new ThreadEx1_1();


        Runnable r =new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t1.start();


    }

}
class ThreadEx1_1 extends Thread {
    public void run(){
        for (int i =0; i<5 ;i++){
            System.out.println(getName()); //조상인 Thread 의 getName()을 호출
        }

    }
}
class ThreadEx1_2 implements Runnable{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }


    }
}