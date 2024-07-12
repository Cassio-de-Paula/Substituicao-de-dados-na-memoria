package LRU;

public class Data {
    String value;
    int lastRef = 0;

    public Data(String value) {
        this.value = value;
    }
}
