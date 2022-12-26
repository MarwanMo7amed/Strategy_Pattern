package Duck;

import FlyBehav.Fly;
import QuackBehav.Quack;

public abstract class Duck {
    Fly fly;
    Quack quack;
    public void performFLy(Fly fly){
        fly.fly();
    }
    public void performQuack(Quack quack){
        quack.quack();
    }
    public void getFly() {
        fly.fly();
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void getQuack() {
        quack.quack();
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }
    abstract void display();

    @Override
    public String toString() {
        return "Duck{" +
                "fly=" + fly +
                ", quack=" + quack +
                '}';
    }
}
