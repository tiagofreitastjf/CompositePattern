public class TI implements IndicadorDeLivros{
    @Override
    public String Indicador(final String indicador) {
        String livro = indicador + " Padrões de Projeto - Soluções Reutilizaveis de Software Orientado a Objetos";
        return livro;
    }  
}
