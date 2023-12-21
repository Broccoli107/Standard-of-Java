package 남궁성_12_08._9단원_연습문제.Ex9_10;

public class Ex9_10 {

    //주어진 문자열을 지정된 크기의 문자열로 반환한다. 나머지 공간은 공백으로 한다.


    static String format(String str, int length, int alignment) {

        //1. length의 값이 str의 길이보다 작으면, length만큼만 잘라서 반환한다.
        if (length < str.length()) return str.substring(0, length);
        //2. 1의 경우가 아니면 length크기의 char 배열을 생성하고 공백으로 채운다.
        else{

        char[] s= new char[length];
        for(int i=0; i<s.length; i++ ){
            s[i]=' ';
        }
        //3.정렬 조건에 따라 문자열을 복사할 위치를 결정한다.
            char[] charArray = str.toCharArray();





         //왼쪽정렬
         if( alignment==0)
             System.arraycopy(charArray,0,s,0,charArray.length);

//        //가운데정렬
            else if( alignment==1)
                System.arraycopy(charArray,0,s,(s.length-charArray.length)/2,charArray.length    );


        //오른쪽 정렬
            else if(alignment==2)
                System.arraycopy(charArray,0,s,s.length-str.length(),charArray.length);


            return  new String(s);




        }

    }


    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬


    }
}
