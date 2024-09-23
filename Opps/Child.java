package Opps;

public class Child extends Parent{
    static int sub(int a,int b)
    {
        return a-b;
    }
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.add(2,3));
        System.out.println(Child.sub(4,2));
    }
}
