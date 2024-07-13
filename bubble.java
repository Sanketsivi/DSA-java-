public class bubble {
    public static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+"");


        }
    }
public static void main(String[] args){
    int array[]={23,4,21,56,1,78};
    for(int i=0;i<array.length-1;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
    }
    print(array);
}
    
}
