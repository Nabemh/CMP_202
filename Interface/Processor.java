package Interface;

public class Processor {
    String type = "core i5";
    int numberofCores = 2;

    @Override
    public String toString(){
        return "Processor{" + "type='" + type + '\'' + ", numberOfCOres=" + numberofCores + '}';
    }
    
}
