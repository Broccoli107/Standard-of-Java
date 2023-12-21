package 남궁성_12_13._11단원_예제;

import java.util.HashSet;

public class Ex11_23 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("david", 10));
        set.add(new Person("david", 10)); //이름과 나이가 중복되어도 출력이 된다. 왜냐하면 equals()랑 hashcode()메서드를 구현을 안해줘서
        //그걸 이용해서 중복인지아닌지 모르기떄문
        System.out.println(set);


    }
}
    class Person {
        String name;
        int age;

       Person( String name, int age){
           this.name = name;
           this.age= age;
       }

    public String toString(){
           return "name: "+name+" age: "+age;
    }


    }




