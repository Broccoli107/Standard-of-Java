package 남궁성_11_20.별찍기;

public class 별찍기Ex02 {
    public static void main(String[] args) {
for(int i=1; i<=5; i++){
    for(int j=1; j<=5; j++ ){
        if(i==j) {//좌표로 생각하면 좀 쉽다.
            System.out.print("*");
        }
        else{
                System.out.print(" ");
            }

    }
    System.out.println();

}
}
    }
