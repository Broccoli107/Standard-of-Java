package 남궁성_12_11._9단원_예제;

public class Ex9_30 {
    final static int RECORD_NUM=10;
    final static String Table_name= "TesT_TABLE";

    final static  String[] CODE1= {"010", "011","017", "018", "019"};
    final static  String[] CODE2= {"남자", "여자"};
    final static  String[] CODE3 ={"10대","20대", "30대", "40대","50대"};

    public static void main(String[] args) {




    }



public static String getRandArr( String []arr){
        return arr [getRand(arr.length-1)];
}




public static int getRand (int n){
        return getRand(0, n);
}

    //from과 to 사이의 임의의 정수 메서드 (to, from 포함)
public static int getRand(int from, int to){
        return (int)(Math.random()*Math.abs(from-to+1))+Math.min(from, to);

}

}
