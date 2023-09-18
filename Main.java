public class Main {
    public static void main(String[] args) {
        System.out.println("Hi from current thread "+Thread.currentThread().getName());

         NumberPrinter np=new NumberPrinter();
        for(int i=1;i<=100;i++)
        {
           
            Thread t=new Thread(np);
            t.start();
        }
        System.out.println("Bye from current thread "+Thread.currentThread().getName());
    }
}
