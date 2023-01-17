
public class Main {
    public static void main(String[] args) throws Exception{
       MyThread myThread1 = new MyThread();
       MyThread myThread2 = new MyThread();
        System.out.println("First thread started");
       myThread1.start();
       try {
           Thread.sleep(5000);
           myThread1.interrupt();
           Thread.sleep(5000);
       }catch (InterruptedException e){
           System.out.println("Thread1 has been interrupted");
       }
        System.out.println("First thread has been finished");
        System.out.println("Work status of first thread - " + myThread1.isAlive());
       myThread2.start();
        System.out.println("Second thread started");
        try{
            Thread.sleep(5000);
            myThread2.interrupt();
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Thread2 has been interrupted");
        }
        System.out.println("Second thread has been finished");
        System.out.println("Work status of second thread - " + myThread2.isAlive());
    }

}
class MyThread extends Thread{
    public void run(){

    }
}
