public class App {
    public static void main(String[] args) throws Exception {
        SelecaoTreino slcTreinoBracos = new SelecaoBracos();
        Treino t1 = slcTreinoBracos.TreinoEscolhido();

        SelecaoTreino slcTreinoPernas = new SelecaoPernas();
        Treino t2 = slcTreinoPernas.TreinoEscolhido();
    }
}
