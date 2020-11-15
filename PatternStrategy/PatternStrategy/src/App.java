import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Biblioteca bb = new Biblioteca(new TI());
        
        System.out.println("Indicação: \n" + bb.ObterIndicacao());
    }
}
