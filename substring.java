public class substring {
    static class  Node{
        Node children[];
        boolean eow;
         public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
            children[i]=null;
            }
            eow=false;

         }
}
static  Node root=new Node();
public static void insert(String word){
    Node curr=root;
    for(int i=0;i<word.length();i++){
        int idx=word.charAt(i)-'a';

        if(curr.children[idx]==null){
            curr.children[idx]=new Node();

        }
        if(i==word.length()-1){
         curr.children[idx].eow=true;
        }
        curr=curr.children[idx];
    }
}
public static boolean search(String key){
    Node curr=root;
    for(int i=0;i<key.length();i++){
        int idx=key.charAt(i)-'a';

        if(curr.children[idx]==null){
            return false;

        }
        if(i==key.length()-1 && curr.children[idx].eow==false){
            return false;
        }
        curr=curr.children[idx];
    }
    return true;

}
public static int substr(Node root){
    int count=0;
    if(root==null){
        return 0;
    }
    for(int i=0;i<26;i++){
    if(root.children[i]!=null){
        count+=substr(root.children[i]);


    }
    }
    return count+1;
}
    public static void main(String []args){
        
        String key="abc";
        
        for(int i=0;i<=key.length();i++){
            insert(key.substring(i));
            
            
        }
        

        System.out.println(substr(root));
        }

}
