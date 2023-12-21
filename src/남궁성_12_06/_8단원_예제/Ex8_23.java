//package 남궁성_12_06._8단원_예제;
//
//import jdk.jshell.spi.ExecutionControl;
//
////
//public class Ex8_23 {
//    public static void main(String[] args) {
//        try {
//            install();
//        }catch (InstallException e){
//            e.printStackTrace();
//        }catch ( Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//
//    static void install() throws InstallException {
//        try {
//            startInstall(); //설치를 시작하는 메서드 호출
//            copyFiles();    //파일을 복사하는 메서드 호춯
//
//
//        } catch (SpaceException se) {
//            InstallException ie = new InstallException(" 설치 중 예외 발생 ");
//            ie.initCause(se);
//            throw ie;
//        } catch (MemoryException me) {
//            InstallException ie = new InstallException(" 설치 중 예외 발생");
//            ie.initCause(me);
//            throw ie;
//        } finally {
//            deleteTempFiles();
//        }
//
//    }
//
//static void startInstall() throws SpaceException, MemoryException {
//
//        if (!enoughSpace()) {
//            throw new SpaceException("설치할 공간이 부족합니다.");
//        }
//        if (!enoughMemory()) {
//            throw new MemoryException("메모리가 부족합니다.");
//        }
//    }
//
//    static void copyFiles(){} //파일을 복사하는 메서드
//    static void deleteTempFiles(){} //임시 파일을 삭제하는 메서드
//
//    static boolean enoughSpace(){//저장 공간이 충분한지에대한 불리언 메서드
//
//    return true;
//    }
//    static boolean enoughMemory(){
//        return false;
//    }
//
//    class InstallException extends Exception{
//        InstallException (String msg){ //Exception 생성자를 불러서 InstallException의 생성자를 만든다.
//            super(msg);
//        }
//    }
//    class SpaceException extends Exception{
//        SpaceException (String msg){
//            super( msg );
//        }
//    }
//
//    class  MemoryException extends Exception{
//        MemoryException (String msg ){
//            super( msg );
//        }
//    }
//
//}
//

