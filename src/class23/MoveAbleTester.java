package class23;

public class MoveAbleTester {

    public static void main(String[] args) {

        MoveAble obj = new Dog();
        WashAble obj2 = new Dog();

        MoveAble[] objects = {new Dog(), new Cat(), new Horse()};
        for (MoveAble m : objects){
            m.move();
        }



    }
}




