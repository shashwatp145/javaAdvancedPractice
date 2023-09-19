package threadsbasics;

public class threads{
    public static void main(String[] args) {
        
     System.out.println("hello from thread : "+Thread.currentThread().getName());

     threadCreator tc=new threadCreator();
     Thread t=new Thread(tc);
     t.start();

    }
}