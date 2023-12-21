package 남궁성_12_20._13단원_예제.Ex13_13;

import javax.swing.*;

public class Ex13_13 {
    public static void main(String[] args) {
        ThreadEx13_1 th1 =new ThreadEx13_1();

        th1.start();
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은 "+input+"입니다.");//값을 입력히먄 밑에 interrupt 메서드 가 호출됨
        th1. interrupt();//값을 입력하면 interrupted 상태가 true가 되면서 th1 종료
        System.out.println("IsInterrupted ():"+ th1.isInterrupted()); //쓰레드의 상태를 변환 그래서 th1.은 다시 false 로
       System.out.println("IsInterrupted ():"+ th1.interrupted());//false인 이유: 이코들를 실행하고있는 건 main 쓰레드
        // 그 실행하고있는 thread 상태를 보여주는거 th1이 아니라
        System.out.println("IsInterrupted ():"+ Thread.interrupted());

    }
}
class ThreadEx13_1 extends Thread{
    public  void run() {
        int i =10;
        while (i!=0 && !isInterrupted()) {
            System.out.println(i--);
            for ( long x = 0 ; x<250000000;  x++);//시간 지연 코드 x를250000000 번 증가시켜야하니 당연하다
        }
        System.out.println("카운트가 종료되었습니다.");

    }
}