public class RecebidoState implements MensagemState {
    @Override
    public void ProximoStatus(Mensagem msn) {
        System.out.println("Mensagem recebida.");
    }
 
    @Override
    public void StatusAnterior(Mensagem msn) {
        msn.SetState(new EnviadoState());
    }

    @Override
    public void ExibirStatus() {
        System.out.println("Mensagem recebida.");
    }
}
