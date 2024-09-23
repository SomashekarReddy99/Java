package Strings;
public class wordreverse {
 public static void main(String[] args) {
    String word="My name is Soma from Bangalore";
    String[] ans=word.split("\\s+");
     StringBuilder anss=new StringBuilder();
     for(int i=ans.length-1;i>=0;i--)
     {
        anss.append(ans[i]);
        if(i!=0)
        {
            anss.append(" ");
        }
      
     }
     System.out.println(anss);
 }   
}
