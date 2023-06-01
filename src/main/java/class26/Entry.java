package class26;

public class Entry {

    private String key;
    private Double value;

    public Entry(String key, Double price) {
        this.key = key;
        this.value = price;
    }

    public String getKey() {
        return key;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
