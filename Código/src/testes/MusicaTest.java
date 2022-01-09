package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Musica;

class MusicaTest {
	
	public static Musica mus;	

	@BeforeEach
	void setUp() throws Exception {
		mus = new Musica("Thriller", 3.20, "S");
	}

	@Test
	void testNomeMusica() {
		assertEquals("Thriller", mus.getTituloMusica());
	}
	
	@Test
	void testDuracaoMusica() {
		assertEquals(3.20, mus.getDuracao());
	}
	
	@Test
	void testMusicaFav() {
		assertEquals("S", mus.getFavorita());
	}

}
