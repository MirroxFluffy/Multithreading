public class Main {
        public static void main(String[] args) throws Exception {
            MyThread myThread = new MyThread();
            myThread.start();

            System.out.println("Message from first thread");
            FirstThread firstThread = new FirstThread();
            firstThread.start();
        }
    }
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

    }
    }
    class FirstThread extends Thread{
    public void run(){
        System.out.println("Message from second thread");
    }
    }
