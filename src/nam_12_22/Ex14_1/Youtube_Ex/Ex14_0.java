package nam_12_22.Ex14_1.Youtube_Ex;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {
    public static void main(String[] args) {
//        //배열을 스트림으로 바꾸는법
        String[] str =new String[]{"a","b","d"};
//        Stream<String> strStream = Stream.of ("a","b","C"); //가변인자형태
//        Stream<String> strStream = Stream.of (new String[] {"a","b","c","d"}); //그냥 배열을 집어넣었다.
            Stream<String> strStream = Stream.of (str);

        strStream.forEach(System.out::println);


        Integer[] intArr ={1,2,3,4,5};
        Stream<Integer> stream = Arrays.stream(intArr);
        System.out.println(stream.count()); //스트림으로 하면 count 메서드밖에 이용을 못하지만
        int[] intArr2= {1,2,3,4,5,6,7};
        IntStream intStream= Arrays.stream(intArr2);
//        intStream.forEach(System.out::println);
        System.out.println(intStream.average()); //이렇게 intStream 형태로 하면, 여러가지메서드를 사용할 수잇다.
//        System.out.println(intStream.sum());
//        System.out.println(intStream.max());






    }
}
