public class queuejava {
        static class queue{
          int size;
       int arr[];
         int rear=-1;
        queue(int n){
            this.size=n;
            arr=new int[size];


        }
       
            public boolean isEmpty(){
                return rear==-1;

            }
            public void add(int data){
                if(rear==size-1){
                    System.out.println("size is full!");
                    return;
                }
                rear++;
                arr[rear]=data;
                }
            public int remove(){
                if(isEmpty()){
                    System.out.println("No elemnt in the list is present");
                    return -1;
                }
                int front=arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];

                }
                rear--;
                return front;
            }
            public int peek(){
                if(isEmpty()){
                    System.out.println("No elemnt in the list is present");
                }
               
                return arr[0];
            }
            }
        
        public static void main(String []args){
            queue sa=new queue(5);
            sa.add(7);
            sa.add(6);
            sa.add(5);
            sa.add(4);
            System.out.println(sa.peek());
            System.out.println(sa.remove());
            System.out.println(sa.peek());




        }
       }

    
