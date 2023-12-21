package 남궁성_11_22._5단원_2차원배열quiz;

public class ex04 {
    public static void main(String[] args) {
        int [] arr= {1,7,2,1,7,3,5,3,3};

        //1 중복을 제거한 결과
        int[] count= new int[10];
        //arr에 존재하는 숫자를 count 배열에 집어 넣는다.
        for(int i=0; i<arr.length;i++){
            count[arr[i]-1]=arr[i];

            }

        //count에 있는 0을 제외한 숫자들만 출력한다.

        for( int i=0; i<count.length; i++) {
            if (count[i] != 0) {
                System.out.print(count[i]);
            }

        }
        System.out.println();




        // 2정렬된 결과


        for (int i =0; i< arr.length-1;i++){
        //배열 옆에있는것 끼리 비교해서 작은 값은 왼쪽으로 보내 최종적으로 큰값이 맨 오른쪽에 위치하게 된다.
        for (int j=0; j<arr.length-1-i; j++){
            if (arr[j]>arr[j+1]){
                int tmp =arr[j];
                arr[j]= arr[j+1];
                arr[j+1] =tmp;

            }
        }


        }
        //배열 출력
        for ( int k=0; k <arr.length; k++ ){
            System.out.print(arr[k]);
        }


    }
}
