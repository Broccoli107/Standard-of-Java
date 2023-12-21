package 남궁성_12_21.Ex13_21;

public class Ex13_21 {
    public static void main(String[] args) {
        Runnable r =new  RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();

    }



}
class  Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) { //이 상태에서 메서드를 호출하면 -값이 나온다. 이유는
        //쓰레드의 불확실성 때문에, 처음쓰레드가 if을 통과를 하고  돈을 뽑을때 두번째 쓰레드가 이미 다 통과해서 출금을 하는 경우가 발생하기 때문이다.
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
        }
    }

}

class RunnableEx21 implements Runnable {
    Account acc =new Account ();

    public void run (){
        while (acc.getBalance() >0) {
            int money =(int )(Math.random() *3 +1) *100;
            acc.withdraw (money);
            System.out.println("balance:"+ acc.getBalance());
        }

    }

}