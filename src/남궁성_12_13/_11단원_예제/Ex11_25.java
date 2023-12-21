package 남궁성_12_13._11단원_예제;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_25 {
    public static void main(String[] args) {
//Hashset A와 B에 숫자를 집어넣고 교집합 합집합 차집합
//교집합은


        HashSet setA =new HashSet();
        HashSet setB =new HashSet();
        HashSet kyo = new HashSet();
        HashSet hap = new HashSet();
        HashSet cha = new HashSet();


        setA.add("1"); setA.add("2"); setA.add("3"); setA.add("4"); setA.add("5");
        System.out.println(setA);
        setB.add("4");setB.add("5");setB.add("6");setB.add("7");setB.add("8");
        System.out.println(setB);

        Iterator it = setB.iterator();

       while (it.hasNext()){
           Object tmp = it.next();

        if (setA.contains(tmp)){
            kyo.add(tmp);
        }


       }
        System.out.println(kyo);

         it = setA.iterator();//iterator는 재사용이 안되므로 다시 생성해야한다.

        //합집합 구하는 방법
        //헤시셋 hap에다가 다 집어넣으면 된다. 어차피 중복 허용안하니까
        while (it.hasNext()){
              hap.add(it.next()) ;
        }

        it= setB.iterator();
        while (it.hasNext()){
             hap.add(it.next());
        }
        System.out.println(hap);



        //차집합 - setA에서 setB랑 겹치는 걸 빼면된다.
        it= setA.iterator();

        while (it.hasNext()){
            Object tmp =it.next();

            if(!setB.contains(tmp)){

                cha.add(tmp);
            }
        }


        System.out.println(cha);











    }
}
