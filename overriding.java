
 class ride{
    int i;
    public void print(){
        System.out.println("hello hye!");
    }

}
class ride2 extends ride{
    public void print(){
        System.out.println("bue guys!");
        super.print();
        super.i=10;

    }
}

    public class overriding {
        public static void main(String [] ar){
            ride2 r=new ride2();
                r.print();
            }
        }
    
