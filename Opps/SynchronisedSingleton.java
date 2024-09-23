package Opps;
public class SynchronisedSingleton {
     String name;
    private SynchronisedSingleton(String name)
    {
      this.name=name;
    }
    private static SynchronisedSingleton instance;
    private static final Object lock=new Object(); 
    public static SynchronisedSingleton getInstance(String name)
    {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SynchronisedSingleton(name);
                }
            }
        }
      return instance;
    }
    public static void main(String[] args) {
        SynchronisedSingleton obj=SynchronisedSingleton.getInstance("soma");
        SynchronisedSingleton obj2=SynchronisedSingleton.getInstance("rama");
        System.out.println(obj.name);
        System.out.println(obj2.name);

    }
}
