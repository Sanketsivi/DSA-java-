public class selectionsort {
    public static void selection(int array[]){
        for(int i=0;i<array.length-1;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
                

                }
                int temp=array[min];
                    array[min]=array[i];
                    array[i]=temp;
            }
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+"  ");
            }

        }
    
    

        
       
    public static void main(String []a){
       int array[]={23,1,45,7,9,2};
       selection(array);
    }
    
}
