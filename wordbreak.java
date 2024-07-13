public class wordbreak {
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
// it break the key  and check whether the word present in key if whole key break and word
// present in trie then it will return true 
public static boolean breakprob(String word){
    if(word.length()==0){
        return true;
    }
    for(int i=1;i<=word.length();i++){
        String first=word.substring(0, i);
        String second=word.substring(i);
        if(search(first) && breakprob(second)){
            return true;
        }
    }
    return false;
}
    public static void main(String []args){
        String words[]={"hello","iam","sanket","choud"};
        String key="";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        
        System.out.println(breakprob(key));
        }

    
}
