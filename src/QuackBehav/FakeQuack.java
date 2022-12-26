package QuackBehav;

public class FakeQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("Fake Quack");
    }
}
