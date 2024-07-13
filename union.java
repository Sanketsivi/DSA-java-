import java.util.*;
public class union {
    public static void unionset(int []arr1,int []arr2){
       HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
           num.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
           num.add(arr2[j]);
        }
        System.out.println(num);


    }
    public static void main(String []args){
        int []arr1={3,4,5,6,7};
        int []arr2={7,6,5,8,9};
        unionset(arr1, arr2);
        
    }
    
}
