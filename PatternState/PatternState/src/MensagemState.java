public interface MensagemState {
    void ProximoStatus(Mensagem msn);
    void StatusAnterior(Mensagem msn);
    void ExibirStatus();
}
