package 남궁성_11_21._5단원예제;

public class ex06 {
    public static void main(String[] args) {
        int[]score={79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

     for( int i=1; i<score.length; i++ ){
         if(max<score[i]){
             max=score[i];
         }

     }
        System.out.println("최대값:" + max);

        for( int i=1; i<score.length; i++ ){
            if(min>score[i]){
                min=score[i];
            }
        }

        System.out.println("최소값:" + min);


    }
}
