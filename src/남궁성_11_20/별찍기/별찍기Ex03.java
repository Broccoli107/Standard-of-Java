package 남궁성_11_20.별찍기;

public class 별찍기Ex03 {
    public static void main(String[] args) {
        for( int i=5; i>=0; i--){
            for( int j = 0; j<5; j++){
                if(i==j){
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
