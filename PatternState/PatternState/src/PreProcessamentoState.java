public class PreProcessamentoState implements MensagemState {

    @Override
    public void ProximoStatus(Mensagem msn) {
        msn.SetState(new EnviadoState());
    }

    @Override
    public void StatusAnterior(Mensagem msn) {
        System.out.println("Processando mensagem.");
    }

    @Override
    public void ExibirStatus() {
        System.out.println("Preparando mensagem para envio.");
    }
}