package 남궁성_12_04.Ex7_24;
//테스트 해보기
public class Ex7_24 {
    public static void main(String[] args) {
        Fighter f= new Fighter();
    if( f instanceof Unit) System.out.println( "f는 Unit 클래스의 자손입니다.");
        if( f instanceof Fightable) System.out.println( "f는 Fightable 인터페이스의 자손입니다.");
        if( f instanceof Movable) System.out.println( "f는 Movable 인터페이스의 자손입니다.");
        if( f instanceof Attackable) System.out.println( "f는 Attackable 인터페이스의 자손입니다.");
        if( f instanceof Object) System.out.println( "f는 Object 클래스의 자손입니다.");


    }
}



//인터페이스를 구현하고 Unit을 상속 받는 Fighter 클래스 생성
class Fighter extends Unit implements Fightable{
    public void move (int x, int y){
        /*내용생략*/
    }

    public void attack (Unit u){
        /*내용생략*/
    }

}






//유닛 클래스 생성
class Unit{
    int currentHp; //현재 체력
    int x; //x축 위치
    int y;//y 축 위치
}

//인터페이스 생성
interface Fightable extends Movable, Attackable{//인터페이스는 인터페이스로 부터만 상속을받고 다중 상속 가능하다.(구현된게 없으니 충돌될것이 없기 떄문

}

interface Movable { void move (int x, int y);}
interface Attackable {void  attack (Unit u);}