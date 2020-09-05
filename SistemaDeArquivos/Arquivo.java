public class Arquivo
{
  private String nome;
  private int tamanho;

  public Arquivo(String nome)
  {
    this.nome = nome;
  }

  public String GetNomeArquivo()
  {
    return nome;
  }

  public void SetNomeArquivo(String nome)
  {
    this.nome = nome;
  }

  public int GetTamanhoArquivo()
  {
    return tamanho;
  }

  public void SetTamnhoArquivo(int tamanho)
  {
    this.tamanho = tamanho;
  }
}