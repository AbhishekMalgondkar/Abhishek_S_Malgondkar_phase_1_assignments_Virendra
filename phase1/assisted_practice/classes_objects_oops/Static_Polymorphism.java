package phase1.assisted_practice.classes_objects_oops;

class DisplayOverloading
{
    protected void disp(char c)
    {
         System.out.println(c);
    }
    
    public void disp(char c, long num)  
    {
         System.out.println(c + " "+num);
    }
    
    double disp(int c)
    {
       System.out.println(c);
       return 0;
    } 
}

public class Static_Polymorphism
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       
       obj.disp('a');
       obj.disp('a',10); //?
       obj.disp(5);       
   }
}