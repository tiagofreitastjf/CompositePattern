import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Leitor leitor = null;
        System.out.print("Arquivo: ");
        String arquivo = reader.readLine();
        System.out.print("Tamanho: ");
        int tamanho = Integer.parseInt(reader.readLine());

        System.out.println("\nEscolha um leitor de arquivo:\n" +
        "1 - Leitor TXT\n" +
        "2 - Leitor PDF");
        int idLeitor = Integer.parseInt(reader.readLine());

        if (idLeitor == 1) {
            leitor = new LeitorTXT(arquivo, tamanho);
        } else if (idLeitor == 2) {
            leitor = new LeitorPDF(arquivo, tamanho);
        }

        System.out.println(leitor.Ler());
        System.out.println("Tamnho do arquivo: " + leitor.Tamanho());
    }
}
