package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {

        Headset obj = new Headset("Razor H1", 79.89, 4120);
        Headset obj1 = new Headset("Razor H2", 75.89, 4620);
        Headset obj2 = new Headset("Razor H3", 77.89, 4320);
        Headset obj3 = new Headset("Razor H4", 74.89, 4220);

        List<Headset> headset = new ArrayList<>();
        headset.addAll(Arrays.asList(obj, obj1, obj2, obj3));
        //printList(headset);
        System.out.println(headset); // internally Java will call toString method

    }

    public static void printList(List<Headset> hVariable) {
        for (Headset h : hVariable) {
            h.toString();
        }
    }


}


class Headset {

    private String title;
    private double price;
    private int numOfReviews;

    public Headset(String title, double price, int numOfReviews) {
        this.title = title;
        this.price = price;
        this.numOfReviews = numOfReviews;
    }

    public void printInfo() {
        //System.out.println(title + " " + price + " " + numOfReviews);
    }

    @Override
    public String toString() {
        return title + " " + price + " " + numOfReviews;
    }




}