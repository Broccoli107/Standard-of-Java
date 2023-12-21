package 남궁성_12_19;

//열거형 선언 (상수들 집합)
//enum 열거형 이름 {상수들}
enum Direction {EAST, WEST, SOUTH, NORTH}
public class Ex12_5 {
    public static void main(String[] args) {
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.valueOf("WEST");
        Direction2 d3 = Enum.valueOf( Direction2.class, "EAST");

        System.out.println( "d1= "+d1);//d1은 EAST
        System.out.println("d2= "+ d2);//d2는 WEST
        System.out.println("d3 =" +d3);

        System.out.println( "d1==d2 ?" + (d1==d2));
        System.out.println("d1==d3 ?"+ (d1==d3));
        System.out.println(d1.equals(d3));
        System.out.println(d1.compareTo(d2)); //0-1
        System.out.println(d2.compareTo(d3));




        switch (d1){
            case EAST: //Direction.EAST라고 쓸 수업다.
                System.out.println("The directio is EAST."); break;
            case SOUTH:
                System.out.println("The directio is SOUTH."); break;

            case WEST:
                System.out.println("The directio is WEST."); break;

            case NORTH:
                System.out.println("The directio is NORTH."); break;
            default:
                System.out.println("INVALID DIRECTION"); break;
        }


        Direction2[] darr = Direction2.values();//열거형의 상수를 모두 배열로 반환[]


        for (Direction2 d :  darr){ //향상된 for 문 배열에서 전체적으로 요소들을 순회할때 사용하면 좋다. (코드의 간결성)
            System.out.printf("%s=%d%n", d.name(),d.ordinal() ); //oridinal 메서드 열거형에 몇번째 있는지
        }


    }
}
