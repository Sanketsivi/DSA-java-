import java.util.HashSet;

public class intesection {
    public static void intesectionset(int arr1[],int arr2[]){
        HashSet<Integer> num=new HashSet<>();
        HashSet<Integer> x=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            num.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(num.contains(arr2[j])){
                count++;
                num.remove(arr2[j]);
                
                 

            }
           
        }
         System.out.println(count);
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5};
        int arr2[]={4,5,6,7,8};
        intesectionset(arr, arr2);
    }
    
}
