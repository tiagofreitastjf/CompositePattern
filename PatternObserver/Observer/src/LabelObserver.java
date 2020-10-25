public class LabelObserver extends Observer {
    
    public LabelObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Label: " + subject.getState());
    }
}
