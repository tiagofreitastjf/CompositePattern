public class LeitorPDF extends Leitor {
    
    public LeitorPDF(String nomeArquivo, int tamanho)
    {
        this.nomeArquivo = nomeArquivo;
        this.tamanho = tamanho;
    }

    public String Ler() {
        return "Processando arquivo " + this.nomeArquivo + " (PDF).\nProcesso completo.\nExibindo na tela.";
    }

    public int Tamanho()
    {
        return this.tamanho;
    }
}
