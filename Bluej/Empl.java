class Person{
    int age;
    String name;
    String nation;
    void get_display(int age,String name,String nation){
        this.name=name;
        this.age=age;
        this.nation=nation;
    }
        
    }
public class Empl extends Person{

int id;
String company;
String loc;
    void display2(int id,String company,String loc,int age,String name, String nation){
        this.id=id;
        this.company=company;
        this.loc=loc;
        super.get_display(age,name,nation);
   
 System.out.println("age"+age+"name"+name+"nationality"+nation+"id"+id+"company"+company+"location"+loc);
        }
    public static void main(String args[]){
    Empl em=new Empl();
    em.display2(900,"SIEMENS","Eranakulam",900,"Abhijith","INDIAN");
}}
  