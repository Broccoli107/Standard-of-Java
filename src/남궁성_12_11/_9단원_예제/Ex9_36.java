package 남궁성_12_11._9단원_예제;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex9_36 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner( new File("data2.txt"));
        int sum =0;
        int cnt= 0;

        while ( sc.hasNext()){
            sum+=sc.nextInt();
            cnt++;
        }
    }
}
