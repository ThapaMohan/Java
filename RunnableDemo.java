public class RunnableDemo {
    public static void main(String[] args) {
        System.out.println("Main thread is "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            Thread t1=new Thread(new RunnableDemo().new RunableImpl());
             t1.start();
        }
    }
    public class RunableImpl implements Runnable{
        public void run(){
            System.out.println(Thread.currentThread().getName()+", executing run() method!");
        }
    }
}
