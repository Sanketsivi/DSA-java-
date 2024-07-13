public class firstlast {
    public static int first=-1;
    public static int last=-1;
    public static void first(String s,int idx,char element){
        if(idx==s.length()){
            System.out.println(first+" "+last);
            return;
        }
        char curchar=s.charAt(idx);
        if(curchar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        

        }
first(s,idx+1,element);
    }
    public static void main(String []args){
        String s="aabcdeabca";
        first(s,0,'a');
    }
    
}
