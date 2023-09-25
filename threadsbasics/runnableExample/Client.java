package runnableExample;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
 public static void main(String[] args) throws InterruptedException, ExecutionException {
      
  ExecutorService es=Executors.newFixedThreadPool(10);

  GreetingsGenerator gc=new GreetingsGenerator();

  Future<String> greetingPromise=es.submit(gc);

  System.out.println("Doing other work....");
  
  String s=greetingPromise.get();

  System.out.println(s);

  System.out.println("After promise is completed this will run...");
  es.shutdown();
 }

  
  

}
