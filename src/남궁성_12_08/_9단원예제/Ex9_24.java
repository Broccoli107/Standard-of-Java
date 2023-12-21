package 남궁성_12_08._9단원예제;

public class Ex9_24 {
    public static void main(String[] args) {
        int i = new Integer("100").intValue();//Integer 클래스를 int 기본령으로
        int i2= Integer.parseInt("100");//문자열을 기본형으로
        Integer i3 = Integer.valueOf("100");//문자열을 Wrapper 클래스로

        int i4= Integer.parseInt("100",2);//문자열"100"을 가본형 100 (100은 2진법으로 나타넨 숫자)
        int i5= Integer.parseInt("100",4);
        int i6= Integer.parseInt("100",8);
        int i7= Integer.parseInt("100",16);
        int i8= Integer.parseInt("FF",16);//16진수에는 F가 있다.


        Integer i9 =Integer.valueOf("100", 2);//문자열 100을 Wrapper 클레스로
        Integer i10 =Integer.valueOf("100", 4);
        Integer i11 =Integer.valueOf("100", 8);
        Integer i12 =Integer.valueOf("100", 16);


        System.out.println(i9/*toString*/); // 원래는 Integer 객체의 클래스이름과 주소값이 나와야 하지만, 그 안에 있는 값이 중요하기 때문에
        //안에 있는 값이 나오도로 오버라이딩 되어있다.















        System.out.println(i9);
    }
}
