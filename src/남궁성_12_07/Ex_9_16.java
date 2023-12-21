package 남궁성_12_07;

public class Ex_9_16 {
    public static void main(String[] args) {
        int ival = 100;
        String strVal = String. valueOf(ival);//기본현 (정수형)->문자열로

        double dval = 200.0;
        String strVal2= dval +"";               /* String.valueOf(dval*/  ;//기본형 (실수형)-> 문자열로

        double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2);

        double sum2 = Integer .valueOf( strVal) + Double.valueOf(strVal2); //"200.0" ,"100" ->200.0, 100
        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum); //"'은 구분자 join은 문자열들을 합친다.
        System.out.println(strVal+"+"+strVal2+"="+sum);
    }
}
