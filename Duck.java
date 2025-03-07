abstract public class Duck {
    public Object display;
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehaviour flyBehaviour;
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    abstract void display();
    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performSwim() {
        swimBehaviour.swim();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

}
