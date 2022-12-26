package QuackBehav;

public class MuteQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("Can not Quack!");
    }
}
