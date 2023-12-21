package 남궁성_12_06._8단원_예제;

//public class Ex8_21 {
//}
//
//
//
//class NewExceptionTest {
//    public static void main(String[] args) {
//
//        try {
//        startInstall();
//        copyFiles();
//        }catch (SpaceException e){
//            System.out.println( "에러메세지: "+ e.getMessage());
//            e.printStackTrace();
//            System.out.println( "공간을 확보한 후 다시 설치헤 주시기바랍니다.");
//        }catch (MemoryException me) {
//            System.out.println("에러메서지: " + me.getMessage());
//            me.printStackTrace();
//
//            System.gc();//Garbage collection을 수행하여 메모리를 늘려준다.
//            System.out.println("다시 설치를 시도하세요");
//
//        }finally {
//        deleteTempFiles();
//        }
//
//
//    }
//
//    static void startInstall() throws SpaceException, MemoryException {
//        if ( ! enoughSpace() ){
//            throw new SpaceException("설치할 공간이 부족합니다.");
//        }
//
//        if (! enoughMemory() ){
//            throw new MemoryException("메모리가 부족합니다.");
//        }
//
//    }
//
//    static  void copyFiles(){}
//    static  void  deleteTempFiles () {}
//
//
//    static boolean enoughSpace() {
//        return false;
//    }
//    static boolean enoughMemory() {
//        return true;
//    }
//
//
//    class SpaceException extends Exception { //사용자 지정 예외
//        SpaceException (String msg){
//            super(msg);
//        }
//    }
//    class MemoryException extends Exception{ //사용자 지정 예외
//        MemoryException (String msg){
//            super(msg);
//        }
//    }
//
//
//
//
//}




