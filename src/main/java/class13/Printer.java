package class13;

public class Printer {

    void printSomething(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    void printWord(String word){
        // (String word)" is the method's parameter declaration, which specifies the input to the "printWord" method.
        for (int i = 0; i < 4; i++) {
            System.out.println(word);
        }
    }
    void printWordManyTimes(String word, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(word);
        }
    }



}
