public class Stack {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }

    }
    public  boolean empty(){
        return head==null;
    }
    public  void add(int data){
        Node newnode=new Node(data);
        if(empty()){
            head=newnode;
          
        }
        newnode.next=head;
        head=newnode;
    }
    public  int pop(){
        if(empty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

    }
    public  int peek(){
        if(empty()){
            return -1;
        }
        int top=head.data;
        return top;
    }

    public static void main(String []args){
        Stack s=new Stack();
        s.add(3);
        s.add(4);
        s.add(9);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        

    }
    
}
