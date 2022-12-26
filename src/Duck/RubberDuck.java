package Duck;

import FlyBehav.FlyNoWay;
import QuackBehav.FakeQuack;

public class RubberDuck extends Duck{
    public RubberDuck()
    {
        fly=new FlyNoWay();
        quack=new FakeQuack();
    }
    @Override
    void display() {
        System.out.println("I am a Rubber Duck");
    }
}
