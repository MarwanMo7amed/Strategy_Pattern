package Duck;

import FlyBehav.FlyWithWings;
import QuackBehav.RegularQuack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        fly= new FlyWithWings();
        quack= new RegularQuack();
    }
    @Override
    void display() {
        System.out.println("I'm a Red Headed duck");
    }
}
