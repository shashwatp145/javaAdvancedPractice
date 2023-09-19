package threadsbasics;

public class threadCreator implements Runnable{

    @Override
    public void run() {
       System.out.println("Current running thread is :"+Thread.currentThread().getName());

       
    }


    
}
