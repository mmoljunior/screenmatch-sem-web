package br.jus.br.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("title") String titulo, 
						@JsonAlias("totalSeasons") Integer totalTemporadas,
						@JsonAlias("imdbRating") Integer avaliacao) {
}
