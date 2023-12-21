package 남궁성_12_07.Ex_interfaceTest2;

import java.util.StringJoiner;

public class Ex9_14 {
    public static void main(String[] args) {
        String [ ]animals ={ "dog", "cat", "bear"};
//        String []arr = animals.split(","); //쉽표를 기준으로 자른다.
//
//        System.out.println( String.join ("-",arr));


        StringJoiner sj = new StringJoiner("/","[","]");
        for(String/*변수 타입*/ s/*이름 아무거나*/ :animals/*배열*/) //매개변수 s에 "dog", "cat", "bear" 가 각각 들어간다.
            sj.add(s.toUpperCase());
        System.out.println(sj.toString());

    }
}
