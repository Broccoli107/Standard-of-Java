package 남궁성_12_18.Ex12_3;


//import java.util.ArrayList;
//
//class Fruit { public  String toString(){ return "Fruit";}}
//class Apple extends Fruit { public String toString() {return "Apple";}}
//
//class  Grape extends Fruit {public  String toString() {return  "Grape";}}
//
//
//class Juice{
//    String name;
//
//    Juice (String name) { this.name =  name +"Juice";}
//    public  String toString() {return name;}
//
//
//}
//
//class Juicer {
//    static Juice makeJuice (FruitBox <? extends Fruit> box) { //Fruit 의 자손들만 들어올 수있다.
//        String tmp =""; //빈문자열이 좋은 코드이다. NUll_Exception이 발생하지 않기때문에
//        for (Fruit f : box.getList)
//            tmp += f+ " ";
//        return  new Juice (tmp);
//    }
//
//}
//
//
//
//
//
//
//
//
//
//public class Ex12_3 {
//    public static void main(String[] args) {
//
//        FruitBox <Fruit> fruitBox =new FruitBox<Fruit>();
////        FruitBox<Apple> appleBox =new FruitBox<Apple>();
//        //Fruit과 그의 자손들이 들어갈 수있도록 ?와일드 카드 extends 를 사용했다.
//        FruitBox< ? extends Fruit> appleBox = new FruitBox<Apple>();
//        fruitBox.add
//
//    }
//
//
//
//
//
//
//
//
//class FruitBox<T extends Fruit> extends Box<T>{}
//
//class  Box<T> {
//        ArrayList<T> list = new ArrayList<T>();
//        void add (T item ){list.add(item);}
//
//        T get (int i ) {return list.get (i);}
//
//        ArrayList<T> getList() {return list;}
//
//        int size() {return list.size();}
//
//    public String toString(){
//            return list.toString();
//    }
//
//
//
//
//
//}
//






//
//}
