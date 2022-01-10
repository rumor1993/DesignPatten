import ch1_strategy_pattern.duck.Duck;
import ch1_strategy_pattern.duck.MallardDuck;
import ch1_strategy_pattern.duck.ModelDuck;
import ch1_strategy_pattern.duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
