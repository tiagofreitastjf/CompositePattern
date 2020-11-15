public class Direito implements IndicadorDeLivros{

    @Override
    public String Indicador(final String indicador) {
        String livro = indicador + " LGPD Lei Geral de Proteção de Dados Pessoais: Manual de Implementação";
        return livro;
    }    
}
