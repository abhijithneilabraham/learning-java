 class Multithreaddemo extends Thread{
    public void run(){
        
    try{
       System.out.println("Thread"+Thread.currentThread().getId()+"is running");
    }

catch(Exception e)
 { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
public class Multithread {
    public static void main(String args[])
    {
     int i=8;
     for(i=8;i<20;i++)
     {
         Multithreaddemo obj=new Multithreaddemo();
         obj.start();
         
    }}}