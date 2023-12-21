package 남궁성_12_08._9단원_연습문제;

public class Ex9_1 {
    public static void main(String[] args) {
        SutdaCard c1= new SutdaCard( 3, false);
        SutdaCard c2= new SutdaCard(3,true);


        System.out.println(c1.equals(c2));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard(){
        this(1, true);
    }
    SutdaCard( int num, boolean isKwang){
        this.num= num;
        this.isKwang= isKwang;
    }

//equals룰 num 과 isKwang을 비교하도록 오버라이딩 하시오
public  boolean equals (Object obj){


          if(obj instanceof SutdaCard) {
              SutdaCard s = (SutdaCard) obj; //형변환이 가능한지.
              return this.num == s.num && this.isKwang == s.isKwang;
          }

          else return false;



}




}