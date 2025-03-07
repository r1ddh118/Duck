public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyBehaviour = new CannotFly();
    }
    @Override
    void display() {
        System.out.println(" I am a rubber Duck");
    }
}
