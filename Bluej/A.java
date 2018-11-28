class A
{ int x;
 A (int p)
{ x = p; } void show( )
{ System.out.println("super class method: x = "+x); }
}
class B extends A {
int y;
B (int a,int b)
{ super(a); // (or) x=a; y=b; } void show( )
{ super.show ();
System.out.println("y = "+y);  
System.out.println(“ super x = “ + super.x); } }
class SuperUse
{ public static void main(String args[])
{ B ob = new B (10, 24); ob.show ( ); } }