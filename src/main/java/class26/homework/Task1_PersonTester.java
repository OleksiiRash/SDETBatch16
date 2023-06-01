package class26.homework;

import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;

import java.util.TreeMap;

public class Task1_PersonTester {
    public static void main(String[] args) {

        var person = new TreeMap<>();
        person.put(3, new Task1_Person("Mark", "Owen", 32, 100000));
        person.put(1, new Task1_Person("Lacy", "Smith", 31, 120000));
        person.put(4, new Task1_Person("Kevin", "Onil", 34, 150000));
        person.put(2, new Task1_Person("Jeremy", "Wilson", 29, 95000));

        for (var p : person.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());

        }

    }
}
