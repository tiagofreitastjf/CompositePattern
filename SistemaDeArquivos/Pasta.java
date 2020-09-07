package SistemaDeArquivos;
import Composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Component
{
  private String nome;
  private int size;

  public Pasta()
  {

  }

  public Pasta(String nome, int tamanho)
  {
    this.nome = nome;
    this.size = tamanho;
  }

  protected List<Component> pastas = new ArrayList<>();

  public void add(Component g) {
    pastas.add(g);
  }

  public void remove(Component g) {
    pastas.remove(g);
  }

  public Component getChild(int i) {
    return (Component) pastas.get(i);
  }

  public float getBalance() {
    float totalBalance = 0;
    for (Component f : pastas) {
      totalBalance = totalBalance + f.getBalance();
    }
    return totalBalance;
  }
  /*
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

  public void ListarPastas()
  {
    for (int i = 0; i < pastas.size(); i++)
    {
      System.out.println(pastas.get(i).GetNomePasta());
    }
  }

  public void ListarArquivos()
  {
    for (int i = 0; i < arquivos.size(); i++)
    {
      System.out.println("Nome: " + arquivos.get(i).GetNomeArquivo() + " Tamanho: " + arquivos.get(i).GetTamanhoArquivo());
    }
  }*/
}