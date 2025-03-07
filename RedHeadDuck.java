public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour =  new SwimWithLegs();
        flyBehaviour = new CanFly();
    }
    @Override
    void display() {
        System.out.println("I am a Red Head Duck");
    }
}
