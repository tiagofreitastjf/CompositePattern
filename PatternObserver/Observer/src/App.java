public class App {
    public static void main(String[] args) throws Exception {
        Subject textBox = new Subject();

        new LabelObserver(textBox);
        new ButtonTextObserver(textBox);

        System.out.println("Primeiro letra: ");	
        textBox.setState("A");
        System.out.println("Segunda letra: ");	
        textBox.setState("B");
    }
}
