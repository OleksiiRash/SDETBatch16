package class25;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.css.CSSFontFaceRule;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class E11Maps {

    public static void main(String[] args) {

        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipstick", 100.0);
        makeup.put("BlushOn", 68.0);
        makeup.put("Lipstick", 100.0);
        makeup.put("EyeLiner", 80.0);
        makeup.put("Foundation", 120.0);
        Collection<Double> values = makeup.values();
        values.removeIf(x -> x > 80);
        System.out.println(makeup);

        XSSFWorkbook xssfWorkbook;





    }
}

