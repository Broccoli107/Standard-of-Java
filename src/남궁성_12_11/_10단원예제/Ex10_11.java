package 남궁성_12_11._10단원예제;

import java.text.DecimalFormat;

public class Ex10_11 {
    public static void main(String[] args) {
 //df에서 df2 형식으로
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 =new DecimalFormat("#.###E0");


        try {
            Number num = df.parse("1,234,567.89"); //parse를 통해서 숫자로
            System.out.println("1,234,567.89 ->" + num);

            double d= num.doubleValue(); //숫자를 double 타입으로
            System.out.println( df2.format(num)); //d 를 형식화


        }catch (Exception e){}


    }
}
