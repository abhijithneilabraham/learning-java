class Thread1 extends Thread{
   Thread1(){
    System.out.println("child thread");
    start();
}
public void run(){
    for(i=0;i<10;i++)
    {
        System.out.println("Inside the run of child");
        Thread1.sleep(500);
    }
}
public class ThreadDemo extends Thread
{
    public static void main(String args[])
    {
       Thread1 t1=new Thread1();
       Thread ma=Thread.currentThread();
       System.out.println("Main thread is "+ma); 
       for(int i=0;i<10;i++)
{
System.out.println("Inside the run of main "+i);
Thread.sleep(1000);
    }}}
    