package class6;

public class E6SwitchStatement {
    public static void main(String[] args) {

        String name="Jacob";

        switch (name){
            case "Vlad":
                System.out.println("Algonquin");
                break;
            case "Jacob":
                System.out.println("Chicago");
                break;
            case"Axel":
                System.out.println("Va");
            // we don`t need to use break in the end
        }

    }
}