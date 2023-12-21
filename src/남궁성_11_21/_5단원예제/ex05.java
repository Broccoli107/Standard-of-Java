package 남궁성_11_21._5단원예제;

public class ex05 {
    public static void main(String[] args) {
        int sum=0;//총점을 저장하기위한 변수(그릇)
        float average= 0f;//평균을 저장하기위한 변수(그릇)

    int [] score= {100, 88, 100, 100, 90};

    for(int i=0; i<score.length; i++){
        sum += score[i];
    }
        System.out.println("총점 :"+sum);

    average= sum /(float) score.length;

    System.out.println("평균: "+average);


    }
}
