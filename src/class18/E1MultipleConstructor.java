package class18;

public class E1MultipleConstructor {

    public static void main(String[] args) {

        String str=new String("Java");// we can create any object from already existing VVM database like String, array, int etc.
        char [] chars={'J','a','v','a'};
        String str1=new String(chars);
        System.out.println(str1.toUpperCase()); // convert to uppercase
        //extract java and convert it to upper case
        char [] chars2={'t','h','e','J','a','v','a'};
        String str2 = new String(chars2); // we create String object to operate faster
        System.out.println(str2.substring(3).toUpperCase());







    }
}
