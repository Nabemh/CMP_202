package Interface;

public class RAM {
    String name = "DDR4";
    int readSpeed = 3;
    int writeSpeed = 15;

    @Override
    public String toString() {
        return "RAM{" + "name='" + name + '\'' + ", readSpeed=" + readSpeed + ", writeSpeed=" + writeSpeed + '}';
    }

}
