package 남궁성_12_19;

enum Direction2 {
    EAST(1, ">"), SOUTH(2,"v"), WEST(3,"<"),NORTH(4,"^");

    private static final Direction2[] DIR_ARR = Direction2.values();//열거형의 상수를 모드 배열로 반환하는 메서드
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) {
        this.value =value;
        this.symbol=symbol;
    }
    public int getValue() {return  value;}
    public String getSymbol() {return symbol;}

    public static Direction2 of (int dir) {
        if( dir <1 || dir >4){
            throw new IllegalArgumentException("Invalid value :" +dir);
        }
        return DIR_ARR [dir -1];
    }
    public Direction2 rotate (int num){
        num = num%4;
        if ( num< 0) num+= 4;
        return  DIR_ARR [(value-1+num)%4 ];

    }

    @Override
    public String toString() {
        return "Direction2{" +
                "value=" + value +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}






public class Ex12_6 {
    public static void main(String[] args) {

 for(Direction2 d : Direction2.values()){
     System.out.printf("%s= %d%n", d.name(), d.getValue());
 }



    }
}
