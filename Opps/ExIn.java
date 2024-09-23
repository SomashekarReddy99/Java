package Opps;

public class ExIn implements A{
    public int add(int a,int b)
    {
        return a+b;
    }
    public void print()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        ExIn obj=new ExIn();
        System.out.println(obj.add(3,3));
      obj.print();
      A.print();
    }

  
}
