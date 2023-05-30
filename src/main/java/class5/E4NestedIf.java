package class5;

public class E4NestedIf {
    public static void main(String[] args) {


        int money = 20000;
        String day = "Monday";

        // нужно сильнее изучить эту часть, не совсем понял как у него вышло несколько else один за другим

        if (money > 10000) {
            System.out.println("Lets spend money");
        } else {
            System.out.println("Lets save more");
        }
        if (day.equals("Sunday")) { // don`t forget to use .equals instead of == and ! - not equal
            System.out.println("Lets go shopping");
        } else {
            System.out.println("Lets wait Sunday");
        }


    }
}
