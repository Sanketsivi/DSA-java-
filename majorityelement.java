import java.util.*;
public class majorityelement {
    public static void majority(int []arr){
        HashMap<Integer,Integer>num=new HashMap<Integer,Integer>();
        int l=arr.length;
        for (int i=0;i<l;i++){
            if(num.containsKey(arr[i])){
                num.put(arr[i],num.get(arr[i])+1);
            }
            else{
                num.put(arr[i],1);
            }
        }
        for(int key:num.keySet()){
            if(num.get(key)>l/3){
                System.out.println(key);
            }
        }

    }
    public static void main(String []args){
        int  arr[]={1,2,3,1,4,1,1,5};
        majority(arr);
    }
    
}
