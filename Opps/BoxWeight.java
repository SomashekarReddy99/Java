package Opps;

public class BoxWeight extends Box{
             double weight;
             BoxWeight()
             {
              super();
              this.weight=-1;
             }
             BoxWeight(double l,double h,double w,double weight)
             {
                super(l,h,w);
                this.weight=weight;
             }
             int ADD(int a,int b)
             {
                return super.add(a, b);
             }
             public static void main(String[] args) {
                BoxWeight obj=new BoxWeight();
                System.out.println(obj.l+" "+obj.weight);
                BoxWeight obj2=new BoxWeight(1,2,3,4);
                System.out.println(obj2.l+" "+obj2.weight);
                System.out.println(obj2.ADD(1,2));
             }
}
