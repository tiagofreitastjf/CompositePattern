package SistemaDeArquivos;

import Composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Arquivo
{
  private String nome;
  private int tamanho;

  protected List<Component> arquivos = new ArrayList<>();

  public void add(Component g) {
    arquivos.add(g);
  }

  public void remove(Component g) {
    arquivos.remove(g);
  }

  public Component getChild(int i) {
    return (Component) arquivos.get(i);
  }

  public float getBalance() {
    float totalBalance = 0;
    for (Component f : arquivos) {
      totalBalance = totalBalance + f.getBalance();
    }
    return totalBalance;
  }
  /*
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
  }*/
}