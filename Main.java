import Composite.Component;
import SistemaDeArquivos.*;

class Main {
  public static void main(String[] args) 
    {/*
        Pasta nova = new Pasta("Raiz");
        nova.GetNomePasta();

        Pasta novaSubPasta1 = new Pasta("SubPasta1");
        Pasta novaSubPasta2 = new Pasta("SubPasta2");
        Pasta novaSubPasta3 = new Pasta("SubPasta3");
        Pasta novaSubPasta4 = new Pasta("SubPasta4");
        Pasta novaSubPasta5 = new Pasta("SubPasta5");
        nova.AddPasta(novaSubPasta1);
        nova.AddPasta(novaSubPasta2);
        nova.AddPasta(novaSubPasta3);
        nova.AddPasta(novaSubPasta4);
        nova.AddPasta(novaSubPasta5);

        nova.ListarPastas();*/

        try {
            // Creating a component tree
            Component component = new Pasta();

            // Adding all accounts of a customer to component
            component.add(new Pasta("DA001", 100));
            component.add(new Pasta("DA002", 150));

            Component subComponent = new Pasta();
            component.add(subComponent);
            subComponent.add(new Pasta("SA001", 200));

            //getting composite balance for the customer
            float totalBalance = component.getBalance();
            System.out.println("Total Balance : " + totalBalance);
        }
        catch (Exception e) {
           e.printStackTrace();
        }
    }
}