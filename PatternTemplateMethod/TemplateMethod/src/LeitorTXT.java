public class LeitorTXT extends Leitor {
    
    public LeitorTXT(String nomeArquivo, int tamanho)
    {
        this.nomeArquivo = nomeArquivo;
        this.tamanho = tamanho;
    }

    public String Ler() {
        return "Lendo arquivo " + this.nomeArquivo + " (TXT).\nLeitura completa.\nImprimindo na tela.";
    }

    public int Tamanho()
    {
        return this.tamanho;
    }
}
