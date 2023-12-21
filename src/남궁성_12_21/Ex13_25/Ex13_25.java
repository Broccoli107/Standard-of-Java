package 남궁성_12_21.Ex13_25;


import java.util.ArrayList;

//손님 쓰레드 생성
class Customer implements Runnable {
    private Table  table;
    private  String food;

    Customer (Table table, String food){
        this.table =table;
        this.food =food;

    }
//이제 쓰레드니까 run 메서드 만들어준다.
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){}
            String name = Thread.currentThread().getName();
            table.remove(food);
                System.out.println(name +"failed to eat. :(");

        }

        }
        //손님이 음식을 먹는다.

}


//요리사 쓰레드
class Cook implements Runnable {
    private Table table;
    Cook (Table table){
        this.table =table;
    }
    //쓰레드니 run메서드
    public void  run (){
        //dishName 배열에 있는 음식 추가
        int idx= (int )(Math.random()*table.dishNum());
        table.add (table.dishNames[idx]);
        try {
        Thread.sleep(10);
        }catch (InterruptedException e){}
    }
}
//Table 클래스 만들기
class Table {
    //음식 종류 설정
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();


    public synchronized void add(String dish) {

        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "is waiting");
            try {
                wait();// Cook이 waiting pool에 들어감
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            dishes.add(dish); //dishes ArrayList 에 음식 추가
            notify(); //waiting pool에 있는 CUST를 꺠우기 위함 하지만 누가 일어날지는 랜덤 (waiting pool)에 cook이나 Cust 둘다 있을수 있기 때문
            System.out.println("Dishes :" + dishes.toString());
        }
    }

    public void remove(String dishName) {
        synchronized (this) {
            //아무 음식도 없으면 기다리는 중이라는걸 출력하는 메서드
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {


                System.out.println(name + "is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }


            }
            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();
                        return;
                    }
                }


                try {
                    System.out.println(name + "is waiting");
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

            }
        }
    }
    public int dishNum() {
        return dishNames.length;
    }

}


public class Ex13_25{
    public static void main(String[] args) throws Exception {

    Table table =new Table(); //여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK1").start();//Cook1은 쓰레드 이름 지어주는것
        new Thread(new Customer(table, "donut"), "CUST1 ").start(); //이하동일
        new Thread(new Customer(table, "burger"), "CUST2 ").start();

        Thread.sleep(2000);
        System.exit(0);
    }



}
