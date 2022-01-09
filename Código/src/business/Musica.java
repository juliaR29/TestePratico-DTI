package business;

public class Musica {

	private String tituloMusica;
	private double duracao;
	private String favorita;

	public Musica(String tituloMusica, double duracao, String favorita) {
		this.tituloMusica = tituloMusica;
		this.duracao = duracao;
		this.favorita = favorita;
	}

	public String getTituloMusica() {
		return tituloMusica;
	}

	public void setTituloMusica(String tituloMusica) {
		if (tituloMusica.length() > 0)
			this.tituloMusica = tituloMusica;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		if (duracao > 1.0)
			this.duracao = duracao;
	}

	public String getFavorita() {
		return favorita;
	}

	public void setFavorita(String favorita) {
		this.favorita = favorita;
	}

	public String validaFav(String resp) {
		if ("S".equalsIgnoreCase(resp)) {
			favorita = resp;
		} else if ("N".equalsIgnoreCase(resp)) {
			favorita = resp;
		}
		return resp;
	}

	@Override
	public String toString() {
		return "Titulo: " + tituloMusica + ", duracao: " + duracao + ", favorita:" + favorita;
	}

}
