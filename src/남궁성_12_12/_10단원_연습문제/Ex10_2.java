package 남궁성_12_12._10단원_연습문제;

import java.util.Calendar;

public class Ex10_2 {
    static int paycheckCount (Calendar from, Calendar to) {
        //from 또는 to 가 null 이면 0을 반환한다.
        if (from ==null || to ==null) return 0;
        //from와 to 가 같고, 날짜가 21이면 1을 반환한다.
        if( from.equals(to) && from.get(Calendar.DAY_OF_MONTH)==21)
            return 1;
        //to와from이 몇개월 차이인지 계산
        int fromYear = from.get (Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int fromDay =from.get ( Calendar.DAY_OF_MONTH);

        int toYear = to.get(Calendar.YEAR);
        int toMonth =to.get(Calendar.MONTH);
        int toDay  = to.get(Calendar.DAY_OF_MONTH);
        int monDiff = (toYear *12 +toMonth-fromYear*12-fromMonth);
        if(monDiff<0) return 0;
        if (fromDay<=21 && toDay>= 21) monDiff++;
        if (fromDay >21 && toDay<21) monDiff--;
        return monDiff;












    }








}
