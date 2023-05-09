package class18;

public class TV {
    //Private members of the superclass are not inherited by the subclass
    private static int size; // we can`t get access, only from that class
    protected String make; // if we make it protected we can get access from the child calls even in dif. packages
    String model;
}

class SamsungTV extends TV {

}

class TVTester {
    public static void main(String[] args) {
        SamsungTV sm = new SamsungTV();

    }
}
