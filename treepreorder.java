public class treepreorder {
    static class Node{
        int data;
        Node left; 
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static class Tree{
       static int ind=-1;
        public static Node builder(int nodes[]){
          ind++;
         
         if(nodes[ind]==-1){
            return null;

         }
         Node newnode=new Node(nodes[ind]);
         newnode.left=builder(nodes);
         newnode.right=builder(nodes);
         return newnode;


        }}

        public static void preorders(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data +" ");
            preorders(root.left);
             preorders(root.right);

        }

        public static void inorders(Node root){
            if(root==null){
                return;
            }
            
            preorders(root.left);
            System.out.print(root.data +" ");
             preorders(root.right);

        }

        public static void postorders(Node root){
            if(root==null){
                return;
            }
            
            preorders(root.left);
            preorders(root.right);

            System.out.print(root.data +" ");
             
        }

        
    
    public static void main(String []args){
        int node[]={1,4,5,-1,-1,7,-1,-1,8,-1,-1,9,-1,-1};
        Tree s=new Tree();
        Node root=s.builder(node);
        preorders(root);
        System.out.println();
        inorders(root);
        System.out.println();
        postorders(root);


    }
}
