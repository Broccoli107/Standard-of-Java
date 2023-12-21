package 남궁성_12_07;

import java.io.UnsupportedEncodingException;
import java.util.StringJoiner;

public class Ex9_15 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "기";
    byte [] bArr= str.getBytes("UTF-8"); //문자열을 UTF-8로 변환 (인코딩 방식)
    byte [] bArr2= str.getBytes("CP949");//문자열을 CP949로 변환 (인코딩 방식)
        System.out.println( "UTF-8:" +joinByteArr(bArr));
        System.out.println( "CP949:"+ joinByteArr(bArr2));

        System.out.println("UTF-8:" + new String(bArr, "UTF-8"));//byte 배열을 문자열로 변환
        System.out.println("CP949" + new String(bArr2,"CP949"));

    }

static String joinByteArr (byte[] bArr){
    StringJoiner sj =new StringJoiner(":","[","]");
    for(byte b :bArr)
        sj.add(String.format("%02X", b));
    return sj.toString();

}




}
