package 남궁성_12_06._8단원_예제;

//class Ex8_20 {
//    public static void main(String[] args) {
//        try (CloseableResource cr = new CloseableResource()) {
//            cr.exceptionWork(false);
//        } catch (WorkException e) {
//            e.printStackTrace();
//        } catch (CloseException e) {
//            e.printStackTrace();
//        }
//    }
//
//    class CloseableResource implements AutoCloseable { //close 메서드를 자동을 실행하기위해 Autocloseable 인터페이스를 상송받음
//        public void exceptionWork(boolean exception) throws WorkException {
//            System.out.println("exceptionWork(" + exception + ")가 호출됨");
//
//            if (exception)
//                throw new WorkException("WorkException 발생!!!");
//
//        }
//
//        public void close() throws CloseException {
//            System.out.println("close () 가 호출됨");
//            throw new CloseException("CloseException 발생 !!!");
//
//        }
//
//    }
//
//    class WorkException extends Exception {
//        WorkException(String msg) {
//            super(msg);
//        }
//    }
//
//    class CloseException extends Exception {
//        CloseException(String msg) {
//            super(msg);
//        }
//    }
//}
public class Ex8_20 {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException e) {
            e.printStackTrace();
        } catch (CloseException e) {
            e.printStackTrace();
        }
    }
}
    class CloseableResource implements AutoCloseable {
        public void exceptionWork(boolean exception) throws WorkException {
            System.out.println("exceptionWork(" + exception + ")가 호출됨");

            if (exception)
                throw new WorkException("WorkException 발생!!!");
        }

        public void close() throws CloseException {
            System.out.println("close () 가 호출됨");
            throw new CloseException("CloseException 발생 !!!");
        }
    }

    class WorkException extends Exception {
        WorkException(String msg) {
            super(msg);
        }
    }

    class CloseException extends Exception {
        CloseException(String msg) {
            super(msg);
        }
    }
