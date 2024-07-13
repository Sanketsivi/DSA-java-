public class reversestring {
    public static void revstr(String st,int ind){
        if(ind==0){
            System.out.println(st.charAt(ind));
            return;
        }
        
        System.out.println(st.charAt(ind));
        revstr(st,ind-1);
        


    }    
    public static void main(String [] args){
        String s="abcde";
        revstr(s,s.length()-1);
    }
}
