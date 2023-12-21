package 남궁성_12_18;

import java.util.ArrayList;

class Fruit {   public String toString(){return  "Fruit";} }
class Apple extends  Fruit {public String toString(){return  "Apple";} }
class Grape extends  Fruit {public String toString(){return  "Grape";} }

class Toy   {public String toString(){return  "Toy";} }

public class Ex12_1 {
    public static void main(String[] args) {

        Box<Fruit> fruitBox = new Box<Fruit>(); //Fruit 타입의 객체만 들어올 수있다.
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox =new Box<Toy>();
//        Box<Grape> grapeBox =new Box<Apple>(); Grape타입의 박스에 Appled이 들어올 수 없다.

        fruitBox.add (new Fruit()); //fruitBox안에 Fruit 타입 객체 당영히 들어올 수있다.
        fruitBox.add (new Apple()); //fruitBox안에 Apple 들어올수 있다. 왜냐하면 Apple은 Fruit의 자손이기 때문이다.(다형성)

        appleBox.add(new Apple());
//        appleBox.add(new Grape()); //다형성에 위배

//        appleBox.add (new Toy()); //다형성에 위배

        toyBox.add (new Toy()); //
//        toyBox.add(new Apple());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);


    }
}

class Box<T>{ //이 Box <T>의 객체에는 한 가지의 종류,  즉 T타입의 객체만 저장할 수있다.
    ArrayList <T> list = new ArrayList<T>();
    void add (T item ){list. add(item);}

    T get (int i) {return list.get(i);}
    int size() {return list.size();}
    public String toString () {
        return list.toString();
    }
}
