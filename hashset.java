import java.util.HashSet;
import java.util.Iterator;



public class hashset {
    public static void main(String []args){
        HashSet<Integer>set=new HashSet<>();
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(34);
        System.out.println(set);
        set.remove(8);
        System.out.println(set);
        if(set.contains(11)){
            System.out.println("element is present!");
        }
        else
        System.out.println("not present");
        Iterator it=set.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        


    }
    
}
