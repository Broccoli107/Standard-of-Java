package 남궁성_11_30.TDD_quiz;

 class bingoCount2 {
 //쉬운것 부터 차근차근
//5x5배열을 받아서 빙고의 갯수를 반환하는 bingoCount()메서드를 작성해라
//1. 일단 5X5빙고 배열을 만든다.
//2. 그 배열의 빙고의 갯수를 카운트하는 bingoCount() 메서드를 작성한다.
     //bingoCountd의 메서드는
     // 입력:배열이고
     // 출력: int
//3. 카운트한 빙고 값을 도출한다.
//4. 출력한다.
     public static void main(String[] args) {
//5x5배열 만들기
         int[][] arr = {{1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}
         };


         int count = bingocount2(arr);
         //출력
         System.out.println(count);

     }


     static int bingocount2(int[][] arr) {
//빙고의 카운드를 담아주는 변수 그릇을 만들어준다.
         int cnt = 0;
//이제 빙고를 카운트 하는 방법을 생각해본다. 일단 빙고가 만들어지는 경우의 수를 생각해보자.
         //1.가로 줄이 빌고 일때
         //가로줄이 빙고 일때 가운데 줄의 합이 5이다.
         //첫번째 줄이 합이 빙고잏떄,
//    if(arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]==5){
//       ++cnt;
//    }
//    if(arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3]+arr[1][4]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//    if(arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]+arr[0][5]==5){
//        ++cnt;
//    }
//  위에를 for문으로 다시 정리 하면,
         int row = 0;

         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length ; j++) {
                 row += arr[i][j];
             }
             if (row == 5) {
                 ++cnt;
                  row=0;
             }
         }


         //2.세로 줄이 빙고 일때
//         if (arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0] + arr[4][0] == 5) {
//             ++cnt;
//         }
//         if (arr[0][1] + arr[1][1] + arr[2][1] + arr[3][1] + arr[4][1] == 5) {
//             ++cnt;
//         }
//         if (arr[0][2] + arr[1][2] + arr[2][2] + arr[3][2] + arr[4][2] == 5) {
//             ++cnt;
//         }
//         if (arr[0][3] + arr[1][3] + arr[2][3] + arr[3][3] + arr[4][3] == 5) {
//             ++cnt;
//         }
//         if (arr[0][4] + arr[1][4] + arr[2][3] + arr[3][4] + arr[4][4] == 5) {
//             ++cnt;
//         }

         // 일정 규칙으로 반복되니 for문으로 만들어준다.

      int columnn=0; //같은 세로줄의 합을 더해주는 그릇을 만들어준다.
         for(int i=0;i< arr.length; i++){
             for(int j=0;j< arr.length; j++){
                columnn +=arr[j][i];
             }
             if(columnn==5) ++cnt; columnn=0;// 한 세로줄의 합이 5면 빙고 카운트
         }


         //3.대각선 줄이 빙고 일때
        // if (arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3] + arr[4][4] == 5) ++cnt;
        //이걸 for 문으로 줄이면

         //대각선의 합을 담아주는 그릇을 만들어준다.
         int cross=0;

         for(int i=0; i< arr.length; i++){
             cross+=arr[i][i];
         }
         if(cross==5) ++cnt;
         //4. 역 대각선이 빙고 일때
        // if (arr[0][4] + arr[1][3] + arr[2][2] + arr[3][1] + arr[4][0] == 5) ++cnt;
        //for 문으로 줄이면
         int reverseCross=0;

         for(int i=0; i< arr.length; i++){
             reverseCross+=arr[i][4-i];
         }
         if(reverseCross==5) ++cnt;




         return cnt;// 카운트한 수를 도출해낸다.


     }

 }


