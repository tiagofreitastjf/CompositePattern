public class App {
    public static void main(String[] args) throws Exception {
        Originator originator = new Originator();
        Caretaker shape = new Caretaker();
        
        originator.setState("#1 Forma quadrada: ■");
        shape.add(originator.saveStateToMemento());
        
        originator.setState("#2 Forma circular: O");
        originator.setState("#3 Forma triangular: /_\\");
        shape.add(originator.saveStateToMemento());
        
        originator.setState("#4 Forma retangular: █");
        System.out.println("Forma atual: " + originator.getState());		
        
        originator.getStateFromMemento(shape.get(0));
        System.out.println("Primeira forma salva: " + originator.getState());
        originator.getStateFromMemento(shape.get(1));
        System.out.println("Segunda forma salva: " + originator.getState());
    }
}
