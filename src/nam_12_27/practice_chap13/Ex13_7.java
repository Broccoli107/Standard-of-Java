package nam_12_27.practice_chap13;

import 남궁성_12_07.Ex;

public class Ex13_7 {
    static boolean stopped = false;


    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6 * 1000);
        } catch (Exception e) {
        }
        stopped = true;

        System.out.println("stopped");



    }
}
    class Thread5 extends Thread {
        public void run() {
            for (int i = 0; !Ex13_7.stopped; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(3 * 1000);
                } catch (Exception e) {
                }

            }
            }

    int add(int a, int b){
            return a+b;
        }

    }
