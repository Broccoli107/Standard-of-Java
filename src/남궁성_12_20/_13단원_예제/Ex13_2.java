package 남궁성_12_20._13단원_예제;

public class Ex13_2 {
    public static void main(String[] args) {
     ThreadEx2_1  t1 =new ThreadEx2_1();

        t1.start();


    }
}

class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();

    }

    public void throwException() {
        try {
            throw new Exception();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}