package 남궁성_11_20.별찍기;

public class 별찍기Ex10 {// 정말 기쁘다. 한줄 한줄 어떻게 짤지 생각하고 그 한줄 한줄을 어떻게 이 중 for문으로 합칠지 생각하면 끝
    public static void main(String[] args) {
        for ( int i =4; i>=0; i--){
            for ( int j=1; j<=9-i; j++ ){
                if( j<=i){
                    System.out.print(" ");
                }
            else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
