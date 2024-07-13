public class binarysearch {
    public static void binary(int []array,int f,int l,int key){
        int mid=(f+l)/2;
        while(f<=l){
            if(array[mid]==key){
                System.out.println("Key found at index:"+mid);
                break;
            }
           else if(array[mid]<key){
                f=mid+1;

            }
            else{
                l=mid-1;
            }
            
        }
        if(f>l){
            System.out.println("Key not found.");
        }
    }
    public static void main(String [] aregs){
        int array[]={1,2,4,6,8,99,101,201};
        int l=array.length;
        binary(array, 0, l, 8);
    }
    
}
