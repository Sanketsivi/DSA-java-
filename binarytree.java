public class binarytree {
    static class Node{
         Node left;
         Node right;
         int data;
        Node(int data){
            this.data=data;

        }}

        //insert------>>>>>
        public static Node insert(Node root ,int val){
            if(root==null){
                root=new Node(val);
                return root;


            }
            if(root.data>val){
                root.left=insert(root.left,val);

            }
            if(root.data<val){
                root.right=insert(root.right,val);
            }
            return root;

        }
        //inorder------->>>>
        public  static void  inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);


        }

        //search----->>>
        public static boolean search(Node root, int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
                return search(root.left, key);
            }
            else{
                return search(root.right,key);
            }
        }

        //delete------->>>>
        public static Node delete(Node root,int val){
            if(root.data>val){
                root.left=delete(root.left,val);
            }
            else if(root.data<val){
                root.right=delete(root.right,val);

            }
            else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node I=inordesuc(root.right);
            root.data=I.data;
            root.right=delete(root.right,I.data);
        }
            return root;
        }
    public static Node inordesuc(Node root){
        while(root.left!=null){
            root=root.left;
        }
    
        return root;
    }

    public static void range(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            range(root.left,X,Y);
            System.out.print(root.data+" ");
            range(root.right,X,Y);
            
}
else if(root.data<=X){
    range(root.right,X,Y);

}
else{
    range(root.left,X,Y);
}
}
    public static void main(String[] args){
        int values[]={24,3,67,7,9,136};
        Node root=null;
        for(int i=0;i<values.length;i++){
          root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        /*if(search(root,36)){
            System.out.println("Element is found");
        }
        else{
            System.out.println("No such element");
        }*/
delete(root,9);
inorder(root);
System.out.println();
range(root,3,67);

    }
}
