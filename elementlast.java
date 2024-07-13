public class elementlast {
    public static void last(String s,int ind,char key,String nstr,int count){
    
        if(ind==s.length()) {
        for(int i=0;i<count;i++){
            nstr+=key;
        }
        System.out.println(nstr);
        return;
    }  
    
        char cur=s.charAt(ind);
        if(cur==key){
        
            count++;
            last(s, ind+1, key, nstr, count);
        
        }
        else{
            nstr+=cur;
            last(s, ind+1, key, nstr, count);
        }
    }    
    public static void main(String []rags){
        String s="abbacdefaafg";
        last(s, 0, 'a', " ",0);
    }
}
