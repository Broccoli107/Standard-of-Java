package 남궁성_11_20.별찍기;

public class 별찍기Ex09 {
    public static void main(String[] args) {
//1번

    for( int i = 4; i>=1; i--){
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }




        //2번
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
//4번
      for( int i=4;i>=1; i--){
          for( int j=1; j<=4; j++){
              if(j<i){
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
