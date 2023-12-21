package 남궁성_12_04;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        //Unit2 u = new FIghter (); move 만 실행 가능
//        Fightable f= new Fighter(); 이렇게 해도 가능하다
        f.move(100, 200);
        f.attack(new Fighter());
        Fightable f2 = f.getFightable();

    }
}





abstract  class Unit2{
    int x, y;
    abstract  void move (int x, int y);
    void stop (){
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move ( int x, int y); //public abstract 생략
    void attack ( Fightable f) ;//매개변수 타입이 인터페이스라는의미 :인터페이스 구현한 클래스의 객체만 들어와라라는 의미
    // public abstract 생략
}
//오버라이딩 규칙: 조상보다 접근제어자가 좁으면 안된다.
class Fighter extends  Unit2 implements Fightable{
public  void move ( int x, int y){
    System.out.println( "["+x+","+y+"]로 이동");
}

public void attack (Fightable f){
    System.out.println( f+"를 공경");
}

Fightable getFightable(){ //반환 타입이 인터페이스이다 그 의미 는 인터 페이스를 구현한 객체를 반환한다.
    Fighter f = new Fighter();
    return f; //원래는  return (Fightable)f 이자만 자손에서 조상 형변환 은 자동으로 이루어져서 생략가능
}

}