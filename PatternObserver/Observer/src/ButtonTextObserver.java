public class ButtonTextObserver extends Observer {
    public ButtonTextObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Button text: " + subject.getState());
    }
}
