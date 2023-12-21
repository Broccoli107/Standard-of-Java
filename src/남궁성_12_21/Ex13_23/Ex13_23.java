package 남궁성_12_21.Ex13_23;

import java.util.ArrayList;

public class Ex13_23 {
    public static void main(String[] args) {
        Table table =new Table();
        new Thread(new Cook (table), "COOK1").start();
        new Thread (new Customer(table, "burger")).start();

    }
}

class Customer implements Runnable {
    private Table table;
    private  String food;

    Customer (Table table, String food){
        this.table =table;
        this. food =food;
    }
    public void run() {
        while (true){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){}
                String name = Thread.currentThread().getName();
                if (eatFood())
                    System.out.println(name+ " ate a"+ food);
                else
                    System.out.println(name +"failed to eat :(");
        }


        }
    boolean eatFood(){
        return table.remove(food);
}

}



class Cook implements Runnable {
    private Table table;

    Cook (Table table){
        this.table =table;
    }

    public void run(){
        while (true){
            int idx = (int)(Math.random() *table.dishNum());
            table.add (table.dishNames[idx]);

            try {
                Thread.sleep(1);
            }catch (InterruptedException e){}
        }
    }
}
class Table {
    String [] dishNames ={"donut", "donut", "burger" };
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();
    public void add (String dish){
        if( dishes.size()>=MAX_FOOD)
            return;
        dishes.add(dish);//음식 추가
        System.out.println("Dishes:"+ dishes.toString());
    }


    //지정된 요리 (dishName)를 모두 제거하는 메서드
    public boolean remove ( String dishName){
        for (int i =0; i<dishes.size();i++){
            if(dishName.equals(dishes.get(i))){
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }




    public int dishNum() {return dishNames.length;}

}