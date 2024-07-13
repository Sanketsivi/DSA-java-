import java.util.ArrayList;

public class stack_u_arli {
      static class Stack{
       static  ArrayList<Integer> l=new ArrayList<>();
        public  static boolean isempty(){
             return l.size()==0;

        }
        public static void push(int data){
            l.add(data);

        }
        public static  int pop(){
            if(isempty()){
                return -1;

            }
            int top=l.get(l.size()-1);
            l.remove(l.size()-1);
            return top;
           // return top;

        }
        public  static int peek(){
             if(isempty()){
                return -1;

            }
            int top=l.get(l.size()-1);
            
            return top;

        }
    }
    public static void main(String []args){
       Stack s= new Stack();
        s.push(9);
        s.push(8);
        s.push(7);
        s.push(6);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());


        

    }
    
}
