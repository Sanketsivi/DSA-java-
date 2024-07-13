public class circularqueue {
   static class queue{
        int arr[];
        int size;
        int front=-1;
        int rear=-1;
        queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }        
        public void add(int data){
            if(isFull()){
                return;
                
            }
            if (front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int re=arr[0];
            if(rear==front){
                return rear=front=-1;

            }
            else{
                front=(front+1)%size;
            }

            
            return re;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];

        }

        }
        public static void main(String []args){
            queue s=new queue(4);
            s.add(9);
            s.add(7);
            s.add(4);
            s.add(3);
            System.out.println(s.peek());
            s.remove();
            s.add(5);
            System.out.println(s.peek());


        }

    }
    
    
    

