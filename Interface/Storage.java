package Interface;

public class Storage {
    String type = "SSD";
    String manufacturer = "Samsung";
    int capacity = 512;
    
    @Override
    public String toString() {
        return "Storage{" + "type='" + '\'' + ", manufacturer='" + manufacturer + '\'' + ", capacity=" + capacity + '}';
    }
}
