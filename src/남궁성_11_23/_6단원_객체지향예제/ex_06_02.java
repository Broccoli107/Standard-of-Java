package 남궁성_11_23._6단원_객체지향예제;

public class ex_06_02 {
    public static void main(String[] args) {
        class car2{
        String color;
        String gearType;
        int door;
        car2(){
            this("white", "auto",4);
        }

        car2(String color){
            this (color,"auto" ,4);
        }

        car2 (String color, String gearType, int door){
            this.color=color;
            this.gearType=gearType;
            this.door=door;
        }
        }






        }
}
