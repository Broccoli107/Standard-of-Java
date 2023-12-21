package 남궁성_11_20.연습문제03단원;

public class ex08 {
    public static void main(String[] args) {
        char ch='A';
        ch= (char) (ch + 2);

        float f=(float) 3/2;
        long l= 3000L*3000L*3000L ;
        float f2= 0.1f;
        double d=0.1;

        boolean result= !(d==f2);

        System.out.println( "ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println(result);
    }

}
