package duck;

import duck.fly.FlyBehavior;
import duck.fly.FlyWithWings;
import duck.quack.QuacBehavior;
import duck.quack.Quack;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuacBehavior quacBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuacBehavior(QuacBehavior quacBehavior) {
        this.quacBehavior = quacBehavior;
    }

    public Duck() {
        quacBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quacBehavior.quack();
    }

    public void swim() {
        System.out.println(" 모든 오리는 물에 뜬다. ");
    }
}