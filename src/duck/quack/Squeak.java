package duck.quack;

public class Squeak implements QuacBehavior {
    @Override
    public void quack() {
        System.out.println(" 삑! ");
    }
}
