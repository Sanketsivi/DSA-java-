public class notsorted {
    public static void nosorted(int []array,int idx){
        if(idx==array.length-1){
            System.out.println("Array is sorted");
            return;
        }

        if(array[idx]<array[idx+1]){
            nosorted(array,idx+1);

        }
        else{
            System.out.println("array is not sorted");
        }
      
    }
    public static void main(String []args){
       int array[]={23,56,67,7};
       nosorted(array, 0);
    }
    
}
