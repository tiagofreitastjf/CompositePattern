package SistemaDeArquivos;
import Composite.Component;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Component
{
  private String nome;
  private int size;

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
}