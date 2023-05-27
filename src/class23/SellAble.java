package class23;

public interface SellAble {

    int price = 12000;

    static void sell(){
        System.out.println("Hello static method inside the Interface");
    }

    public static void main(String[] args) {

        SellAble.sell();

    }
}
