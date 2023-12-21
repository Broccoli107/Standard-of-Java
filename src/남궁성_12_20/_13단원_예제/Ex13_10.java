package 남궁성_12_20._13단원_예제;

class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t =new Thread(new ThreadEx10());
        t.setDaemon(true);//데몬쓰레드를 돌리기 전에 true 로해서 쓰레드를 데몬쓰레드로 만들어주고, start() 메서드 호출
        t.start();
        for (int i =1; i<=10; i++){
            try{
                Thread.sleep(1000);//1초 기다린다.
            }catch (InterruptedException e){}
            System.out.println(i);
            if(i==5)
                autoSave =true;

        }
        System.out.println("프로그램을 종료합니다.");
    }



public void run (){
        while (true ){
            try {
            Thread.sleep(3*1000); //3초 기다린다.
            }catch (InterruptedException e){

            }
            if (autoSave){
                autoSave();
            }

        }



}
public void autoSave (){
    System.out.println( "작업파일이 저장되었습니다.");
}



}


