package 남궁성_12_08._9단원_연습문제;

public class Ex9_4 {

   static void printGraphic ( int []dataArr, char ch){
     //메서드명: printGraph
     //기능 : 주어진 배열에 담긴 값만큼 주어진 문자를 가로로 출력한후 값을 출력한다.
for(int i=0; i<dataArr.length;i++) {
    for (int j = 0; j < dataArr[i]; j++) {
        System.out.print("*");

    }
    System.out.print(dataArr[i]);
    System.out.println();
}
   }

    public static void main(String[] args) {
        printGraphic( new int [] {3,7,1,4}, '*');
    }
}
