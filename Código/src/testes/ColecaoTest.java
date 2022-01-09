package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Album;
import business.Colecao;
import business.Musica;

class ColecaoTest {

	public static Colecao col;
	public static Album alb;
	public static Album alb2;
	public static Musica mus;
	public static Musica mus2;
	public static Musica mus3;

	@BeforeEach
	void setUp() throws Exception {
		col = new Colecao();

		alb = new Album("Falling into you", 1996, "Celine Dion");
		mus = new Musica("My Heart Will Go On", 3.40, "S");
		mus2 = new Musica("I'm your angel", 2.20, "N");

		alb2 = new Album("Back in Black", 1980, "AC/DC");
		mus3 = new Musica("Back in  Black", 3.00, "S");
	}

	@Test
	void testAlbumNaColecao() {
		col.adicionarAlb(alb2);
		assertEquals("Titulo: Back in Black, ano de Lancamento: 1980, nome banda: AC/DC", col.consultarTitulo("Back in Black"));
	}

	@Test
	void testAlbumForaDaColecao() {
		col.adicionarAlb(alb);
		assertEquals("Banda não encontrada", col.consultarNome("AC/DC"));
	}

	@Test
	void testAnoAlbum() {
		col.adicionarAlb(alb2);
		assertEquals("Titulo: Back in Black, ano de Lancamento: 1980, nome banda: AC/DC", col.consultarAno(1980));
	}
	
	@Test
	void testAnoErradoAlbum() {
		col.adicionarAlb(alb);
		assertEquals("Ano não encontrado", col.consultarAno(1000));
	}

	@Test
	void testConsultarTituloMusica() {
		col.adicionarAlb(alb);
		alb.adicionarMusica(mus);
		assertEquals("Não encontrada!", col.consultarTituloM("Back in  Black"));
	}

	@Test
	void testConsultarBandaMusica() {
		col.adicionarAlb(alb);
		alb.adicionarMusica(mus2);
		assertEquals("Encontrado!", col.consultarBandaM("Celine Dion"));
	}
}
