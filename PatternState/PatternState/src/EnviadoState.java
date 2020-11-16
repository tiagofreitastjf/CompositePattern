public class EnviadoState implements MensagemState {

    @Override
    public void ProximoStatus(Mensagem msn) {
        msn.SetState(new RecebidoState());
    }

    @Override
    public void StatusAnterior(Mensagem msn) {
        msn.SetState(new PreProcessamentoState());
    }

    @Override
    public void ExibirStatus() {
        System.out.println("Mensagem enviada.");
    }
}
