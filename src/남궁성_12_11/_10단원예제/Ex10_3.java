package 남궁성_12_11._10단원예제;

import java.util.Calendar;

public class Ex10_3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60 ,1};
        final String[] TIME_UNIT_NAME ={"시간", "분", "초"};

        Calendar time1= Calendar.getInstance();
        Calendar time2= Calendar.getInstance();
        time1.clear();
        time2.clear();

        time1.set(Calendar.HOUR_OF_DAY,15);
        time1.set(Calendar.MINUTE, 16);
        time1.set(Calendar.SECOND,30);

        time2.set(Calendar.HOUR_OF_DAY,17 );
        time2.set(Calendar.MINUTE,0);
        time2.set(Calendar.SECOND,0);

        long differece= Math.abs (time1.getTimeInMillis()- time2.getTimeInMillis())/1000;

        System.out.println("time1에서 time2까지 "+differece+"초 남았습니다.");
        System.out.println("time1에서 time2까지 "+differece/60+"분 남았습니다.");


        String tmp = "";
        for ( int  i= 0; i<TIME_UNIT.length; i++){
            tmp += differece/TIME_UNIT[i]+TIME_UNIT_NAME[i]; //처음에는 시간 그다음 분 그 다음 초로 나눠서 표현하게 된다.
            differece %= TIME_UNIT[i]; //처음에는 시간으로 나눠주고 나머지는 분 그다음 분으로 나눈 나머지는 초로.
        }
        System.out.println("시분초로 표현하면 "+tmp +" 입니다.");
    }
}
