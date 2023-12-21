package 남궁성_12_08._9단원예제;

public class Ex9_25 {
    public static void main(String[] args) {
        int i =10;

        Integer intg=(Integer)i; //기본형을 객체로 형변환 가능 (오토박싱)
        Object obj =(Object)i;

        Long lng= 100L; //Long lng = new Long(100L);

        int i2= intg+10;
        long l = intg +lng;

        Integer intg2= new Integer(20);
        int i3 = (int)intg ; //객체를 기본형으로 언박싱


        System.out.println("i = "+i);
        System.out.println("obj = "+ obj);
        System.out.println("lng = "+lng);
        System.out.println("i2 = "+ i2);




    }
}
