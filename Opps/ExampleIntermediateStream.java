package Opps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleIntermediateStream {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> s1=list.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        Stream<Integer> s4 = s3.flatMap(n -> Stream.of(n, n + 1));
        System.out.println(s4);
     int result=s4.reduce(0,(c,e)->c+e);
    
     System.out.println(result);

     int res=list.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
System.out.println(res);
    }
}
