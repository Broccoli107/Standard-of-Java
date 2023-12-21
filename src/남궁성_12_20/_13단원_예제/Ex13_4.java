package 남궁성_12_20._13단원_예제;

public class Ex13_4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//currentTimeMillis()은 현재 시간
        for (int i=0; i <300; i++){
            System.out.printf("%s", new String("-"));
        }
        System.out.println( "소요시간1:"+ (System.currentTimeMillis()-startTime));





    }
}
