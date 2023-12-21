package 남궁성_12_11._10단원예제;

import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) {
        final String[] Day_OF_WEEK={"","일","월","화","수","목","금","토"}; //요일은 1부터 시작한다.
        Calendar date1 = Calendar.getInstance();
        Calendar date2= Calendar.getInstance();
        //date 1과 date2 생성 할때 밀리 초 차이 가 나기 때문에 clear로 초기화 시켜준다.
        date1.clear();
        date2.clear();
        date1.set (2023, 11, 11);//2023년 12월 11일로 세팅
        date2.set (2023,10,20);
        System.out.println("date1은 "+ toString(date1) + Day_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");
        System.out.println("date2는"+toString(date2)+ Day_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");

        //두 날짜간의 시간차 구하는 방법
        long difference= Math.abs((date2.getTimeInMillis()-date1.getTimeInMillis()))/1000;
        System.out.println( "date2부터 date1 까지 "+difference+" 초 지났습니다.");
        System.out.println(" 일로 계산하면, "+ difference/60/60/24+"일 지났습니다");

    }




public static String toString(Calendar date){

        return date.get (Calendar.YEAR)+"년 "+(date.get( Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일 ";



}





}
