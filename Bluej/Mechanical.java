class Electrical{
    void display(){
        System.out.println("I am from electrical department");
    }
}
public class Mechanical extends Electrical{
    void display(){
        System.out.println("I am from Mechanical department");
    }
    public void dept(){
       super.display();
    }
    public static void main(String args[]){
       Mechanical ee=new Mechanical();
       ee.dept();
}}
