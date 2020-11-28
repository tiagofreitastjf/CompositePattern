public class SelecaoBracos extends SelecaoTreino{
    @Override
    public Treino TreinoEscolhido() {
        return new Bracos();
    }
}
