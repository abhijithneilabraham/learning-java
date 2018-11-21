class Jack{
    void say(){
        System.out.println("All work and no play makes jack a dull boy");
    }
}
public class Demo extends Jack{
    void say()
   {
       System.out.println("Jack and Jill went up the hill");
    }
public static void main(){
    Jack obj=new Demo();
    obj.say();
    obj=new Jack();
    obj.say();
}}
'''
I have included both static and dynamic polymorphism example into one program
'''