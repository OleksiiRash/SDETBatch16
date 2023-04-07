package class2;

class StringConcatenation {

/*
Create 2 Strings
Use the concatenation operation to make the following output
Output:
syntaxtechs.com
*/

    public static void main(String[] args) {

        String uriPart1 = "syntaxtechs";
        String uriPart2 = ".com";
        int num1 = 5;
        int num2 = 1;

        System.out.println(uriPart1.concat(uriPart2));
        System.out.println(num1 + num2);

// System.out.println(uriPart1 + "" + uriPart2);

    }
}