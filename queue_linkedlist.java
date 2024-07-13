public class queue_linkedlist {
    static Node head=null;
    static Node tail=null;
     static class Node{
         Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        public boolean isEmpty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node newnode=new Node(data);
            if (tail==null){
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;

        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;


        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            
           
            return head.data;

        }

    }
    public static void main(String []args){
        queue s=new queue();
        s.add(8);
        s.add(9);
        s.add(10);
        s.add(90);
        System.out.println(s.peek());
        System.out.println(s.remove());
        System.out.println(s.peek());


    }
    
}
