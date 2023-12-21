package 남궁성_12_20._13단원_예제.Ex13_12;

public class Ex13_12 {
    public static void main(String[] args) {
        ThreadEx12_1 t1 =new ThreadEx12_1();
        ThreadEx12_2 t2 = new ThreadEx12_2();
        t1.start();
        t2.start();
        try {
         Thread.sleep(2000);
        }catch (InterruptedException e){}
        System.out.println("<<main 종료>>");

    }
}
class ThreadEx12_1 extends Thread {
    public void run (){
        for (int i =0; i< 300; i++){
            System.out.print("-");
        }
        System.out.println("<<th1 종료>>");

    }
}
class ThreadEx12_2 extends Thread {
    public void run() {
        for (int i =0; i<300; i++){
            System.out.print("|");
        }
        System.out.println("<<th2종료>>");

    }
}