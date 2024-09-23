package Opps;


public class Student {

     String name;
     int age;
     float marks;
     {

     }
    Student(String n,int a,float m)
    {
         this.name=n;
         this.age=a;
         this.marks=m;
    }
    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.add(2,3));
    Student s1=new Student("soma", 21, 99.1f);
    Student s2=new Student("shyam", 22, 99.5f);
    Student[] student=new Student[2];
    student[0]=s1;
    student[1]=s2;

for(int i=0;i<student.length;i++)
{
    System.out.println(student[i].name+" "+student[i].age+" "+student[i].marks);
}


    }
}
