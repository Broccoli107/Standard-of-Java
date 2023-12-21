package 남궁성_11_21._5단원quiz;

public class ex02 {//두배열을 비교해서 값이 같고 위치가 다르면 b 같으면 s

    public static void main(String[] args) {

        int s=0;
        int b=0;

        int[]arr1= {1,2,3};
        int[] arr2={2,1,3};//데이터 테스트를 많이 해볼것
//일단 무조건
    for( int i =0; i<arr1.length; i++){//arr1 돌리기
        for(int j=0; j<arr2.length; j++){//arr2 돌리기
            if (arr1[i]==arr2[j] && i==j) {//arr1과 arr2 값비교 &&지리비교
                s++;//값이 같고 자리가 같으면 s++
            }
            else if( arr1[i]==arr2[j] && i!=j){
                b++;//값이 같고 자리가 다르면 b++
            }
        }
    }

        System.out.printf("%dS%dB",s,b);


    }

}
