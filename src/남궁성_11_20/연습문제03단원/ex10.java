package 남궁성_11_20.연습문제03단원;

public class ex10 {
    public static void main(String[] args) {
        char ch='A';
        char lowerCase=('A'<=ch && ch<='Z' ) ? (char)(ch+32) :ch;
        System.out.println("ch="+ch);
        System.out.println("ch to lowerCase="+lowerCase);

    }
}
