import java.io.*;
public class Employee
{
	public Employee()
	{
	String name;
       int salary;	
	}
public static void pay(String n1, int s1)
{
System.out.println("pay this guy"+n1+" salary "+s1);

}

public static void main(String args[])
{
	Employee em= new Employee();
        em.pay("Abhijith",50000);

	
}
}