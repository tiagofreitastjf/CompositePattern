package SistemaDeArquivos;
import java.util.ArrayList;
import java.util.List;

public class Pasta
{
  private String nome;
  private List<Arquivo> arquivos = new ArrayList<Arquivo>();
  private List<Pasta> pastas = new ArrayList<Pasta>();

  public Pasta(String nome)
  {
    this.nome = nome;
  }

  public String GetNomePasta()
  {
    return nome;
  }

  public void SetNomePasta(String nome)
  {
    this.nome = nome;
  }

  public void AddPasta(Pasta nova)
  {
    pastas.add(nova);
  }
}