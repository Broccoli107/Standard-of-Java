package 남궁성_12_04._7단원_연습문제;

public class Ex7_19 {
    public static void main(String[] args) {
        Buyer b= new Buyer();
        b.buy(new Tv());//Product p= new Tv(); b.buy(p)
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());




        b.summary();
    }
}

class Buyer {
    int money= 1000;
    Product [] cart = new Product[3];
    int i=0;

void buy ( Product p){//주소 값이 들어와서 p가 가르키는 객체의 값을 바꾼다.
    //가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
    if (p.price>money){
        System.out.println( "잔액이 부족하여"+p+"을/를 살수 없습니다.");
        return;
    }
    //가진돈이 충분하면, 제품의 가격을 가진 돈에서 빼고, 장바구니에 구입한 물건을 담는다.
    money-= p.price;
    add(p);
}

void add (Product p){


    //i의 값이 장바구니의 크기보다 같거나 크면, 기존의 장바구니 보다 2배큰 새로운 배열을 생성한다.
    if( i >= cart.length ) {
        Product[] cart2 = new Product[cart.length * 2];

        //기존 장바구니의 내용을 새로운 배열에 복사한다.
        System.arraycopy(cart, 0, cart2, 0, cart.length);//cart[0]에서 cart2[0]으로 cart.length 개의 데이터를 복사

        //새로운 장바구니와 기존의 장바구니를 바꾼다.
        cart = cart2;

    }
    //물건을 장바구니에 저장한다. 그리고 i의 값을 1증가 시킨다.

    cart[i++]= p;//매개변수 p의 주소 값을 배열안에 집어넣는다.

    }



void summary(){
    // 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
    String itemList= "";
    //장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
    int sum=0;

    //물건을 사고 남은 금액을 출력한다.

    //장바구니에 담긴 물건들 어떻게 갖고 올건가
//    sum= cart[0].price+cart[1].price+cart[2].price 이걸 for 문으로
    for( int i=0; i< cart.length; i++){
    sum+=cart[i].price;
    itemList+= cart[i]+","; //cart[i].toString에서 toString을 생략한거
    }

      System.out.println( "구입한 물건: "  + itemList);

    //물건을 사고 남은 금액 출력


    System.out.println("사용한 금액 :"+ sum );
    System.out.println("남은 금액 : "+ money );

}


}


class Product {
    int price;
    Product ( int price){
        this. price= price;
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {super(200);}

    public String toString() {return "Computer";}
}


class Audio extends Product{
    Audio (){ super (50);}
    public String toString() {return "Audio";}
}