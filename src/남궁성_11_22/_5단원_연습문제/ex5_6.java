package 남궁성_11_22._5단원_연습문제;

import java.sql.SQLOutput;

public class ex5_6 {
    public static void main(String[] args) {
        int [] coinUnit ={500,100,50, 10};

        int money= 2680;

        System.out.printf("money="+money);

        for ( int i=0; i<coinUnit.length; i++){
            int count=0;

            count=money/coinUnit[i];
            System.out.println();
            System.out.printf("%d원: %d",coinUnit[i],count );


            money=money%coinUnit[i];
        }





    }
}
