import java.io.*;
public class Test1
{
    public static void main(String args[])
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        int d=add(1,2);
        System.out.println(d);
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
}