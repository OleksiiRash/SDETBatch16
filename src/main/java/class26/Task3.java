package class26;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {


        // Map<Integer, String> bestBuy = new HashMap<>();
        var bestBuy = new HashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7664848, "Monitor");
        bestBuy.put(7664849, "Mouse");
        bestBuy.put(7664850, "Mouse Pad");
        bestBuy.put(7664847, "HDMI");

        for (var b : bestBuy.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());
        }


    }
}
