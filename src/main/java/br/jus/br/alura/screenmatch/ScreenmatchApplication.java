package br.jus.br.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.jus.br.alura.screenmatch.model.DadosSerie;
import br.jus.br.alura.screenmatch.service.ConsumoAPI;
import br.jus.br.alura.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=6585022c");
//		System.out.println(json);
//		json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}

}
