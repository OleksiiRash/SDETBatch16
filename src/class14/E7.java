package class14;

public class E7 {

    void printLarger(int a,int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
        //System.out.println(Math.max(a, b));
    }

    public static void main(String[] args) {
        E7 obj=new E7();
        obj.printLarger(60,70);
    }

}