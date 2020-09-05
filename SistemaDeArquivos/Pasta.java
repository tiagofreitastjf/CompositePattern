import java.util.List;

public class Pasta
{
  private String nome;
  private List<Arquivo> arquivos = new List<Arquivo>();
  private List<Pasta> pastas = new List<Pasta>();

  public Pasta(String nome)
  {
    this.nome = nome;
  }

  public String GetNomePasta()
  {
    return nome;
  }

  public String SetNomePasta(String nome)
  {
    this.nome = nome;
  }

  public void AddPasta(Pasta nova)
  {
    pastas.Add(nova);
  }
}