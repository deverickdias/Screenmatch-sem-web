package b.com.alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(@JsonAlias("title") String titulo,
                         @JsonAlias ("totalSeassons") Integer totalTemporada,
                         @JsonAlias("imdbRating") String avaliacao){

}
