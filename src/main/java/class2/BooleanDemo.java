package class2;

public class BooleanDemo {

    public static void main(String[] args) {

        /*
        A boolean can only have two values: true or false.
         */

        boolean isItRaining = false;
        System.out.println(isItRaining);
        boolean areYouHungry = true;
        System.out.println(areYouHungry);
        boolean isUserLoggedIn = true;

        boolean ifUserLoggedIn = true;

        // usually we use boolean for something like this

        if (isUserLoggedIn) {
            // allow access to restricted content
        } else {
            // redirect to login page
        }

    }
}
