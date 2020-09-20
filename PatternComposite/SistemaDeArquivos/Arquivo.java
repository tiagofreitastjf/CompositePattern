package SistemaDeArquivos;

import java.util.ArrayList;
import java.util.List;

public class Arquivo extends Composite
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
  
  public float getBalance() {
      float totalBalance = 0;
      for (Component f : list) {
          totalBalance = totalBalance + f.getBalance();
      }
      return totalBalance;
  }
}