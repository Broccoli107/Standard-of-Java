package 남궁성_11_21._5단원예제;

public class ex07 {
    public static void main(String[] args) {
        int [] numArr= new int [10];
        for(int i=0; i <numArr.length; i++){
            numArr[i]=i;
            System.out.print(numArr[i]);
        }
        System.out.println();
        for(int i=0; i <numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10)+1;
            System.out.print(numArr[i]);
        }





    }

}
