import Duck.Duck;
import Duck.RubberDuck;
import Duck.RedHeadDuck;

public class Main {
    public static void main(String[] args) {

        Duck rubberDuck = new RubberDuck();
        Duck redHead= new RedHeadDuck();
        System.out.println("Rubber Duck : ");
        rubberDuck.getFly();
        rubberDuck.getQuack();
        System.out.println("Red Head Duck : ");
        redHead.getFly();
        redHead.getQuack();
    }
}
