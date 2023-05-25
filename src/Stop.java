public class Stop implements State{
    @Override
    public void notifyState() {
        System.out.println("car has stopped");
    }

    @Override
    public void run() {
        System.out.println("car is going to run");
    }
}
