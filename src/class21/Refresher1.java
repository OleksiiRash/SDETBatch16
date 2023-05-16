package class21;

public class Refresher1 {

    public static void main(String[] args) {

        Dog[] dogs = {

                new Dog("Lal", "Black", "Persian"),
                new Dog("Papi", "White", "chinese")
        };

        for (Dog d : dogs) {
            d.printInfo();
        }


    }
}