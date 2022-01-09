package business;

import java.util.LinkedList;
import java.util.List;

public class Album {

	List<Musica> musicasAlb = new LinkedList<Musica>();
	private String tituloAlbum;
	private int anoDeLancamento;
	private String nomeDaBanda;

	public Album(String tituloAlbum, int anoDeLancamento, String nomeDaBanda) {
		this.tituloAlbum = tituloAlbum;
		this.anoDeLancamento = anoDeLancamento;
		this.nomeDaBanda = nomeDaBanda;
	}

	public List<Musica> getMusicasAlb() {
		return musicasAlb;
	}

	public void setMusicasAlb(LinkedList<Musica> musicasAlb) {
		this.musicasAlb = musicasAlb;
	}

	public void adicionarMusica(Musica m) {
		musicasAlb.add(m);
	}

	public Musica consultar(String desc) {
		for(Musica m: musicasAlb) {
			if(desc.equalsIgnoreCase(m.getTituloMusica())) {
				return m;
			}
		}
		return null;
	}
	
	public String getTituloAlbum() {
		return tituloAlbum;
	}

	public void setTituloAlbum(String tituloAlbum) {
		if (tituloAlbum.length() > 0)
			this.tituloAlbum = tituloAlbum;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		if (anoDeLancamento >= 1900 && anoDeLancamento <= 2022)
			this.anoDeLancamento = anoDeLancamento;
	}

	public String getNomeDaBanda() {
		return nomeDaBanda;
	}

	public void setNomeDaBanda(String nomeDaBanda) {
		if (nomeDaBanda.length() > 0)
			this.nomeDaBanda = nomeDaBanda;
	}

	@Override
	public String toString() {
		return "Titulo: " + tituloAlbum + ", ano de Lancamento: " + anoDeLancamento + ", nome banda: " + nomeDaBanda;
	}

}
