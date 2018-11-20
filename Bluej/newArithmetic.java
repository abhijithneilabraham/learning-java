  class Arithmetic{
    int z;
    public void addition(int a,int b) 
    {
        z=a+b;
        System.out.println("sum is"+z);
    }
    public void subtraction(int a, int b){
    z=a-b;
    System.out.println("Difference is"+z);
}
    }
     class newArithmetic extends Arithmetic{
        public void Multiplication(int a,int b){
            z=a*b;
            System.out.println("product  is"+z);
        }
    
        

    public static void main(String args[])
    {
        newArithmetic na= new newArithmetic();
       na.Multiplication(4,9);
    }
}