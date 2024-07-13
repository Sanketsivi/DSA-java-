public class linked {
    private int size;
    linked(){
        this.size=0;

    }
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
             this.data=data;
             this.next=null;
             size++;
        }   
     }
// add node at first
     public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
     }
// add note at last
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newnode;

    }
    public void deletefirst(){
        if(head==null){
            System.out.println("LIST is null");
            return;
        }
        size--;
        head=head.next;

    }

    public void deletelast(){
        if(head==null){
            System.out.println("LIST is null");
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        size--;
        if(head.next==null){
            head=null;
            return;

        }
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;

    }
    public void print(){
    if (head==null){
        System.out.print("list is empty");
        return;
    }
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+"->>");
            curnode=curnode.next;
        }
        System.out.println("NULL");

    }
    public int getsize(){
        return size;

    }
    public static void main(String []a){
        linked list=new linked();
        list.addfirst("hello");
        list.addfirst("guys");
        list.addfirst("kese ho");
        list.print();
        list.deletefirst();
        list.print();
        list.deletelast();
        list.print();
       System.out.println( list.getsize());

    }
}
