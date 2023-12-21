package 남궁성_12_11._10단원예제;

import java.text.DecimalFormat;

public class Ex10_10 {
    public static void main(String[] args) throws Exception {

        double number = 1234567.89;

        DecimalFormat df= new DecimalFormat("0E0"); // 먼저 원하는 패턴의 DecimalFormat이라는 객체를 생성후
        String result =df.format(number); //format 메서드를 통해서 값을 구함

        System.out.println(result);


    }
}
