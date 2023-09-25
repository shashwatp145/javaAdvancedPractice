package runnableExample;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsGenerator implements Callable<String>{

    Random r=new Random();

    int i=Math.abs(r.nextInt())%5;

    @Override
    public String call() throws Exception {
        if(i==0)
        {
            return "Hi";
        }
        else if(i==1)
        {
            return "hello";
        }
        else if(i==2)
        {
            return "Namaste!";
        }
        else if(i==3)
        {
            return "Hola!";
        }
        else if(i==4)
        {
            return "Moshi moshi";
        }
        return null;
    }
    

}