package 남궁성_12_11._10단원예제;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance(); //Clandar는 추상클래스이기 때문에 메서드를 통해서 객체를 얻어야한다.
      //객체를 생성하면 현재 시간으로 세팅이 된다.
        System.out.println("이해의 년도:"+today.get(Calendar.YEAR));
        System.out.println("월 : " + today.get(Calendar.MONTH));//배열로 지정해 놓아서 0부터 시작한다.그래서 11이 나오면 12월이다.





    }
}
