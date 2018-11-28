class Parentclass
{
   //no-arg constructor
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}
class Subclass extends Parentclass
{
   Subclass(){
       /* super() must be added to the first statement of constructor 
	* otherwise you will get a compilation error. Another important 
	* point to note is that when we explicitly use super in constructor
	* the compiler doesn't invoke the parent constructor automatically.
	*/
	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   public static void main(String args[]){		
	Subclass obj= new Subclass();
	obj.display();	 
   }
}
