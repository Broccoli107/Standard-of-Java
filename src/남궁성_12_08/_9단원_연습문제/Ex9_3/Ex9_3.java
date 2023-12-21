package 남궁성_12_08._9단원_연습문제.Ex9_3;

public class Ex9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";


        path= fullPath.substring(0,fullPath.lastIndexOf("\\"));
        fileName =fullPath.substring(15);
        System.out.println("path:  " +path);
        System.out.println("fileName= "+ fileName);
        System.out.println("fullPath:"+fullPath);

    }
}
