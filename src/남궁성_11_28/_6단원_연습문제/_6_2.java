package 남궁성_11_28._6단원_연습문제;

public class _6_2 {
    public static void main(String[] args) {
        Sutdacard card1= new Sutdacard(3, false);
        Sutdacard card2= new Sutdacard();
        System.out.println( card1.info());
        System.out.println( card2.info());

    }
}
class Sutdacard{
    int num;
    boolean isKwang;
    Sutdacard(){ //기본생성자
        this.num=1;
        this.isKwang=true;
    }
    Sutdacard( int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
String info(){
   return num + ((isKwang)? "k" : " ");
}
}
