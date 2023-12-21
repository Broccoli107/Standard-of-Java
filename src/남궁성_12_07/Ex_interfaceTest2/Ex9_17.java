package 남궁성_12_07.Ex_interfaceTest2;

public class Ex9_17 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");


        System.out.println("sb==sb2 :" +(sb==sb2));
        System.out.println( "sb.equals(sb2) :"+ (sb.equals(sb2))); //Stringbuffer의 equals는 내용비교로 오버라이딩 되어있지 않다.

        //String 객체로 변환
        String s= sb.toString();
        String s2= sb2.toString();

        System.out.println("s.equals(s2): "+ (s.equals(s2)));





    }




}
