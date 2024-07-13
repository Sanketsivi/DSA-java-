import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int a=list.get(2);
        System.out.println(a);
        list.set(3,9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    
        

        }
    
}
