import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Gun: Maverick");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2002);
        lost.exibeFichaTecnica();
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());



    }
}
