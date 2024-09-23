package Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/**
 * MajorityCand
 */
public class MajorityCand  {
    public static void main(String[] args) {
       int[] arr={1,2,2,1,2,2,1,1,4,2,1,2};
       int Cand=MajorCand(arr);
       System.out.println(Cand+" "+Majority(Cand,arr));
    }
    static int MajorCand(int[] arr)
    {
        int cand=0;
        int count=0;
          for(int num:arr)
          {
              if(count==0)
              {
                  cand=num;
              }
              count+=(cand==num)?1:-1;
          }
          return cand;
    }
       static boolean Majority(int cand,int[] arr)
       {
           int count=0;
           for(int num:arr)
           {
            if(cand==num)
            {
                count++;
            }
           }
           return count>arr.length/2;
       }  
}
