

public class linearsearch {
    public static int search(int []array,int n){
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                System.out.println("Number found at index:"+i);
                return 1;
            }
        }
        return -1;

        
    }
    public static void main(String [] args){
        int array[]={25,1,67,2,3,5,6};
        search(array,67);

    }
}
