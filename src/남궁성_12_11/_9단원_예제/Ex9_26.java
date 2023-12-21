package 남궁성_12_11._9단원_예제;

import java.util.Arrays;
import java.util.Objects;

public class Ex9_26 {
    public static void main(String[] args) {

    String [][] str2D= new String[][] { {"aaa","bbb"},{"AAA","BBB"}};
    String [][] str2D2= new String[][] { {"aaa","bbb"},{"AAA","BBB"}};
        System.out.print ("str2d ={");
        for (String[] tmp : str2D) // 향상된 for 문 (각 배열의 값에 접근한다.) 밑에 예시가 있다.
            System.out.print(Arrays.toString(tmp));
        System.out.println("}");


//      String [] str =new String[]{ "aaa", "bbb"};
//
//      for(String tmp : str){
//          System.out.print(Arrays.toString (tmp.toCharArray()));
//      }
        System.out.print( "str2D2= {");
        for (String [] tmp : str2D2){
            System.out.print(Arrays.toString(tmp));
        }
        System.out.print("}");
        System.out.println();

        System.out.println("str2D.equlas(str2D2)= +"+str2D.equals(str2D2)); //이건 str[],str2D2안에있는 주소값을 비교
        System.out.println("str2D.deeppEqulas(str2D2)= "+ Objects.deepEquals(str2D,str2D2)); //str과 str2D2안에 있는 내용을 비교한다.



    }


}
