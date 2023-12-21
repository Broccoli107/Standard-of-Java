package 남궁성_12_08._9단원_연습문제.Ex9_12;

public class Ex9_12 {


    static int getRand(int from, int to){

       return(int)(Math.random()*(Math.abs(to-from)+1))+Math.min(to,from);



    }



    public static void main(String[] args) {
        for (int i =0; i<20; i++)
            System.out.println( getRand(1,-3)+",");
    }
}
