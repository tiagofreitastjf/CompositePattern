public class Biblioteca {
    private IndicadorDeLivros indicador;
    private String livro;

    public Biblioteca(IndicadorDeLivros indicador) {
        this.indicador = indicador;
        livro = "Livro -> ";
    }
    
    public String ObterIndicacao() {
        return indicador.Indicador(livro);
    }
}
