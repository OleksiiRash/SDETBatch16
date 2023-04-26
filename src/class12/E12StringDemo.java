package class12;

public class E12StringDemo {
    public static void main(String[] args) {

        // subString is used to get a part of the complete String
        String sentence="yup we have another class";
        // if we need to specify the value of the String from something till the end we can use one starting index
        System.out.println(sentence.substring(12));
        // if we need extract from and to we need to specify 2 indexes
        System.out.println(sentence.substring(4,11));

        int startIndex = sentence.length()-5;
        System.out.println(sentence.substring(startIndex));



    }
}
