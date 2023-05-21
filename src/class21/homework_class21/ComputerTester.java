package class21.homework_class21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {
                new Apple("MacBook Pro", 2000),
                new Lenovo("i7", 1500),
                new HP("123456789", 1200),
                new Dell("2 years", 1800),
        };

        for (Computer computer : computers) {
            computer.displayInfo();
            computer.turnOn();
            computer.turnOff();

            if (computer instanceof Apple) {
                Apple apple = (Apple) computer;
                apple.useiTunes();
            } else if (computer instanceof Lenovo) {
                Lenovo lenovo = (Lenovo) computer;
                lenovo.useTrackPoint();
            } else if (computer instanceof HP) {
                HP hp = (HP) computer;
                hp.useHPAssistant();
            } else if (computer instanceof Dell) {
                Dell dell = (Dell) computer;
                dell.useDellSupport();
            }
            System.out.println();
        }

    }
}
