import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            // singleton = new Singleton();
        }
        return singleton;
    }

    public void Ler(String caminho) throws IOException
    {
        BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha = "";
        while (true) 
        {
            if (linha != null) 
            {
				System.out.println(linha);
            } 
            else
            {
                break;
            }
			linha = buffRead.readLine();
		}
		buffRead.close();
    }
}
