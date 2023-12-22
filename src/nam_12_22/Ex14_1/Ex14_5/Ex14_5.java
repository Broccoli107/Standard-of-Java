package nam_12_22.Ex14_1.Ex14_5;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_5 {
    public static void main(String[] args) {

        Supplier<Integer> s = ()->(int)(Math.random()*100)+1; // 값이 나오기만 하는 함수,
        Consumer<Integer> c = i-> System.out.println(i+","); // 값이 들어가기만하는경우
        Predicate<Integer> p = i-> i%2==0; //값이 들어가고 Boolean 값을 내놓는 경우
        Function <Integer, Integer> f = i-> i/10*10;



    }

//static <T>List<T> doSomething (Function <T,T>, , List <T>list){
//
//}
static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T>list){
    System.out.print("[");
    for (T i: list){
        if (p.test(i))
            c.accept(i);


    }

    System.out.print("]");



    }


}
