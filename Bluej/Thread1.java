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
    pub
    