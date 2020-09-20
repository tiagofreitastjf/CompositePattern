package ProgramacaoAvancada;
import SistemaDeArquivos.*;

class Main {
    public static void main(String[] args) 
    {
        try {
            // Creating a component tree
            Component component = new Pasta();

            // Adding all accounts of a customer to component
            component.add(new Pasta("DR1", 100));
            component.add(new Pasta("DR2", 150));

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