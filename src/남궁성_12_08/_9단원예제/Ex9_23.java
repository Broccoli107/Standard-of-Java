package 남궁성_12_08._9단원예제;

public class Ex9_23 {
    public static void main(String[] args) {
        Integer i = new Integer(100);//정슈형 기본형을 객체로 (Wrapper class)
        Integer i2= new Integer(99999999);

        System.out.println("i==i2 ?"+(i==i2));
        System.out.println("i.equals(i2) ?"+i.equals(i2)   );//내용비교로 오버라이딩 되어있다.
        System.out.println("i.cmopareTo (i2)= "+ i.compareTo(i2));
        //compareTo 메서드 숫자가 같으면 0, 작으면 1 크면 -1
        System.out.println("Max_VALUE="+ Integer.MAX_VALUE); //int형 최대값
        System.out.println("MIN_VALUE="+ Integer.MIN_VALUE);//int 형 최솟ㄱㅂ값
        System.out.println("SIZE="+ Integer.SIZE);//사이즈
        System.out.println("BYTES="+ Integer.BYTES);// //몇
        System.out.println("Type= "+ Integer.TYPE ); //기본형 타입이 뭔지


    }
}
