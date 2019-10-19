import java.util.*;
import java.lang.*


class square implements Runnable
{
    int y;
    public square(int x)
    {
        y=x;
    }
    public void run()
    {
        System.out.println("Square of the number: "+(y*y));
        System.out.println("Cube of the number ="+(y*y*y));
    }
}

class void cube(int y) 
{
    cube obj=new cube(23)
    int y;
    
    public void run()
    {
        System.out.println("Cube of the number: "+(y*y*y));
    }
}

class generate implements Runnable
{
    public void run()
    {
        int num=0;
        Random r = new Random();
            num= r.nextInt(100);
                System.out.println("Number generated: "+num);
                Thread t1= new Thread(new square(num));
                t1.start();
    }
}

public class p3b
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
           System.out.println("");
        
        try{
            sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    }
}
