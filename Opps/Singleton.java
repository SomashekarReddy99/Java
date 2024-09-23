package Opps;

/**
 * Singleton
 */
public class Singleton {
  String name;
    private Singleton(String name)
    {
         this.name=name;
    }
    private static Singleton instance;
    public static Singleton getinstance(String name)
    {
        if(instance==null)
        {
            instance=new Singleton(name);
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton obj=Singleton.getinstance("soma");
        System.out.println(obj.name);
        Singleton obj1=Singleton.getinstance("rachan");
        System.out.println(obj1.name);
    }
}