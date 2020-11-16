public class App {
    public static void main(String[] args) throws Exception {
        Mensagem msn = new Mensagem();
        msn.ExibirStatus();

        msn.StatusPosterior();
        msn.ExibirStatus();

        msn.StatusPosterior();
        msn.ExibirStatus();
    }
}
