public class Run implements State{
    @Override
    public void notifyState() {
        System.out.println("car is running");
    }

    @Override
    public void run() {
        System.out.println("car is running already");
    }
}
