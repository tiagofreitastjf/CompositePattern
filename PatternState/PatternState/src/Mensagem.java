public class Mensagem {
    private MensagemState state = new PreProcessamentoState();

    public void StatusPrevio() {
        state.StatusAnterior(this);
    }

    public void StatusPosterior() {
        state.ProximoStatus(this);
    }

    public void ExibirStatus() {
        state.ExibirStatus();
    }

    public void SetState(MensagemState msnStatus) {
        state = msnStatus;
    }
}
