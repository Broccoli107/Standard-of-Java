package nam_12_22.Ex14_1.Ex14_4;

import java.util.ArrayList;

public class Ex14_4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            list.add(i);
        }
        list.forEach (i -> System.out.println(i+","));
        System.out.println();

    }
}
