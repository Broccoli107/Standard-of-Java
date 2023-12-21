package 남궁성_12_08._9단원_연습문제.Ex9_6;

public class Ex9_6 {
    static String fillZero (String src, int length){
        //1.src가 널이거나, src.length()rk length 와 같으면 src를 그대로 반환한다.
        if( src ==null || src.length()==length)
            return src;

        //2.length의 값이 0 보다가 같거나 작으면 빈 문자열을 반환한다.
        else if (length<=0) return "";

        //3.src의 길이가 length 의 값보다 크면 src를  length 만큼 잘라서 반환한다.
        else if (src.length()>length) {
            return src.substring(0,length);
        }
        //4.길이가 length 인 char 배열을 생성한다.
        char[] str =new char[length];
        //5. 4에서 생성한 배열을 0으로 채운다.
        for( int i=0; i<str.length; i++){
            str[i] ='0';
        }
        //6. src에서 문자배열을 뽑아내서 4에 생성한 배열에 복사한다.
        char[] charArray = src.toCharArray();
        System.arraycopy(charArray,0,str,length-charArray.length,charArray.length);

    return new String (str);
    }

    public static void main(String[] args) {
String src ="12345";
        System.out.println(fillZero(src, 10) );
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src, 3));



    }

}
