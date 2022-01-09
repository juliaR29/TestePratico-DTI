package business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Colecao {

	List<Musica> musicas = new LinkedList<Musica>();
	List<Album> albuns = new LinkedList<Album>();

	public List<Musica> getMusicas() {
		return musicas;
	}

	public List<Album> getAlbuns() {
		return albuns;
	}

	public void adicionarAlb(Album a) {
		albuns.add(a);
	}

	public String consultarTitulo(String teclado) {
		for (Album alb : albuns) {
			if (teclado.equalsIgnoreCase(alb.getTituloAlbum())) {
				return alb.toString();
			}
		}
		return "Titulo não encontrado"; // não encontrado
	}

	public String consultarAno(int teclado) {
		for (Album alb : albuns) {
			if (teclado == alb.getAnoDeLancamento()) {
				return alb.toString();
			}
		}
		return "Ano não encontrado"; // não encontrado
	}

	public String consultarNome(String teclado) {
		for (Album alb : albuns) {
			if (teclado.equalsIgnoreCase(alb.getNomeDaBanda())) {
				return alb.toString();
			}
		}
		return "Banda não encontrada"; // não encontrado
	}

	public void remover(String teclado) {
		albuns.removeIf((a) -> teclado.equalsIgnoreCase(a.getTituloAlbum()));
	}

	public String consultarTituloM(String teclado) {
		for(Musica m: musicas) {
			if(teclado.equalsIgnoreCase(m.getTituloMusica())) {
				return "Encontrado!"+ m;
			}
		}
		return "Não encontrada!";
	}

	public String consultarBandaM(String teclado) {
		for (Album mus : albuns) {
			if (teclado.equalsIgnoreCase(mus.getNomeDaBanda())) {
				return "Encontrado!";
			}
		}
		return "Banda não encontrada"; // não encontrado
	}

	public List<Musica> playlist() {
		List<Musica> playlist = new ArrayList<Musica>();
		
		musicas = playlist.stream()
						  .filter(p -> p.getFavorita().startsWith("S") && p.getFavorita().startsWith("N"))
						  .sorted(Comparator.comparing(Musica::getFavorita))
						  .collect(Collectors.toList());		
		playlist.forEach(System.out::println);
		return playlist;

	}

	@Override
	public String toString() {
		return "Colecao [musicas=" + musicas + ", albuns=" + albuns + "]";
	}

}
