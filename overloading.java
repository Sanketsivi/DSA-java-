 class add{
public int sum(int a,int b){
    return a+b;
}
public int sum(int a,int b, int c){
    return a+b+c;
}
public double sum(double a,double b){
    return  a+b;
}
}
public class overloading {
    public static void main(String []arg){
        add a=new add();
           System.out.println( a.sum(4,7));
            System.out.println(a.sum(9,8,79));
            System.out.println(a.sum(4.9,9.9));
        }

    }

