package class13.homowork_class13;

public class Task1 {

    public static void main(String[] args) {

/*
Task1_C16:
How would you reverse a String word by word? for example:
// input=>This is sentence i want to reverse
// output=>sihT si ecnetnes i tnaw ot esrever
 */

        String convert = "This is sentence i want to reverse";
        StringBuilder str = new StringBuilder(convert);
        str.reverse();
        convert = str.toString();
        String[] newConvert = convert.split(" ");

        for (int i = newConvert.length-1; i >=0; i--) {
            System.out.print(newConvert[i] + " ");
        }

        System.out.println();





    }
}
