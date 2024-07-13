public class Toh {
    public static void hanoi(int n,String src,String hel,String des){
        if(n==1){
        System.out.println("Move the ring "+ n+" from "+src+" to "+des);
        return;
        }
         hanoi(n-1,src,des,hel);
         System.out.println("Move the ring "+ n+" from "+src+" to "+des);
         hanoi(n-1,hel,src,des);



    }
    public static void main(String []args){
        int n=3;
        hanoi(n,"s","h","d");





    }
    
}
