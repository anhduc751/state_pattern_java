public class Car {
    private State state;
    public Car() {
        state = new Stop();
    }
    public void setState(State state){
        this.state = state;
    }
    public void carNotification(){
        state.notifyState();
    }
    public void carRun(){
        state.run();
    }

}
