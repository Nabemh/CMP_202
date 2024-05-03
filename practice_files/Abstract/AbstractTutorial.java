package practice_files.Abstract;

abstract class Dog {
    String breed;


    public void bark() {
        System.out.println("Bark!");

    }

    public abstract void poop();

}

class GermanShepard extends Dog {
    public void poop() {
        System.out.println("Dog Pooped!");
    }

}
public class AbstractTutorial {
    public static void main(String[] args) {
        GermanShepard g = new GermanShepard();
        g.bark();
        g.poop();
        System.out.println("Pooped?");
    }
}