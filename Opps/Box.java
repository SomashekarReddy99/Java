package Opps;

public class Box {
    double l;
    double h;
    double w;
    Box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double l,double h,double w)
    {
        this.l=l;
        this.h=h;
        this.w=w;
    }
    int add(int a,int b)
    {
        return a+b;
    }
}
