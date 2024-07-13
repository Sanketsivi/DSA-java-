class abc{
    int age;
    String name;
    abc(){
        System.out.println("hello guys");
    }
    public void info(int n,String s){
        age=n;
        name=s;
    }
    public void print(){
        System.out.println("My name is:"+name+" and my age is:"+age);
    }
}
public class Oops {
    public static void main(String[] args){
        abc s=new abc();
        s.info(21,"sanket");
        s.print();
        
    }
    
}
