package 남궁성_12_04.Ex7_22;
//1.가격과 보너스포인트 변수를 가지는 Product 클래스 생성
class Product {
    int price;

    int bonusPoint;
    Product (int price){
        this.price= price;
        this.bonusPoint= (int)(price/10.0);
    }
    Product(){} //Product 클래스의 기본 생성자
}


//2. Product 클래스를 상속 받는 Tv, Computer, Audio 클래스 생성
class Tv extends Product{
    Tv(){
        super(100);//Tv는 100만원으로 초기화
    }
    public String toString(){ return "Tv";}
}
class Computer extends Product {
    Computer (){
        super(200);
    }
    public String toString(){
        return  "Computer";
    }

}

class Audio extends Product{
    Audio(){
        super(50);
    }
public String toString(){
        return "Audio";
}
}
//3. 물건을 사는 Buyer 클래스 생성


class Buyer {
    int money =1000;

    int bonusPoint = 0;

    Product [] item = new Product[10]; //Product 타입의 item이라는 배열을 만들어서 Tv, Computer, Audio 객체가 들어갈 배열을 만들어준다.
     int i=0;// 각 물건을 item 배열안에 집어 넣는다.
    //4. Buyer 클래스안에 물건을 사서 남은 돈을 계산하고, 남은돈을 계산해서 물건을 살 수 있는지, 보너스 포인트가 어느정도인지를 알려주는 메서드 생성
    void buy(Product p){
        if (money< p.price){
            System.out.println(" 잔액이 부족하여 물건을 살 수 없습니다.");
             return;
        }
      money-=p.price;
      bonusPoint+= p.bonusPoint;
        item[i++]=p;

        System.out.println(p+"을/를 구입하셨습니다.");//여기 안에 있는 p는 p.toString()


    }

void Summary (){
        int sum=0;
        String itemlist = "";

        // 반복문을 이용해 총가격과 산 물건 목록를 얻는다.
        for( int i=0; i< item.length; i++){
            if( item[i] == null){
                break;
            }

            sum+= item[i].price;
            itemlist+= item[i]+", ";//원래는 item[i].toString()이지만 toString은 생략가능
        }

    System.out.println( "구입하신 물품의 총금액은 "+ sum + "만원 입니다.");
    System.out.println( " 구입하신 제품른 "+ itemlist +"입니다.");


    }




}





//5. 생성한 클래스 테스트
//6.출력
public class Ex7_22 {
    public static void main(String[] args) {
        Buyer b= new Buyer();
        b.buy ( new Tv()); //Product p = new Tv(); Tv를 가르키는 참조변수 p의 주소값을 buy 메서드안에 집어넣는다.
        b.buy (  new Computer());
        b.buy(new Audio());
        b.Summary();
    }
}
//Product 클래스 만들기
