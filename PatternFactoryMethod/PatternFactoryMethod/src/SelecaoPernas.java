public class SelecaoPernas extends SelecaoTreino {
    @Override
    public Treino TreinoEscolhido() {
        return new Pernas();
    }
}
